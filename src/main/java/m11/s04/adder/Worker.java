package m11.s04.adder;

public class Worker extends Thread {
    private long[] data;
    private int begin;
    private int end;
    private long result = 0;

    Worker(long[] data, int begin, int end) {
        this.data = data;
        this.begin = begin;
        this.end = end;
    }

    @Override
    public void run() {
        for (int i = begin; i < end; i++) {
            result += data[i];
        }
    }

    public long getResult() {
        return result;
    }
}
