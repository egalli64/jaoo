package m11.s04.adder;

import java.util.Arrays;
import java.util.stream.LongStream;

public class Main {
    private static final int SIZE = 200_000_000;

    public static void main(String[] args) {
        long[] data = LongStream.rangeClosed(1, SIZE).toArray();
        System.out.println("Values in data: " + data[0] + " ... " + data[data.length - 1]);

        for (int j = 0; j < 10; j++) {
            long start = System.currentTimeMillis();
            long result = plainAdder(data);
            long time = System.currentTimeMillis() - start;
            System.out.println("Plain " + result + " after " + time);

            start = System.currentTimeMillis();
            result = mtAdder(data);
            time = System.currentTimeMillis() - start;
            System.out.println("MT " + result + " after " + time);

            start = System.currentTimeMillis();
            result = Arrays.stream(data).parallel().sum();
            time = System.currentTimeMillis() - start;
            System.out.println("Stream " + result + " after " + time);

            System.out.println("---");
        }
    }

    private static long plainAdder(long[] data) {
        long result = 0;
        for (long value : data) {
            result += value;
        }
        return result;
    }

    private static long mtAdder(long[] data) {
        Worker[] workers = {new Worker(data, 0, data.length / 4),
                new Worker(data, data.length / 4, data.length / 2),
                new Worker(data, data.length / 2, data.length / 4 * 3),
                new Worker(data, data.length / 4 * 3, data.length)};

        for (Worker worker : workers) {
            worker.start();
        }

        for (Worker worker : workers) {
            try {
                worker.join();
            } catch (InterruptedException e) {
                System.out.println("Unexpected interrupt: " + e);
            }
        }

        long result = 0;
        for (Worker worker : workers) {
            result += worker.getResult();
        }
        return result;
    }
}
