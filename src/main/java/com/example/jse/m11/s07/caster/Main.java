package com.example.jse.m11.s07.caster;

public class Main {
    private static final int NR = 3;

    public static void main(String[] args) {
        System.out.printf("Casting %d dice, only 1, 2, and 3 are accepted%n", NR);

        Worker[] workers = new Worker[NR];
        for (int i = 0; i < workers.length; i++) {
            workers[i] = new Worker();
        }

        for (Worker worker : workers) {
            worker.start();
        }

        int result = 0;
        for (Worker worker : workers) {
            try {
                worker.join();
                int die = worker.getResult();
                if (die > 0) {
                    result += die;
                    System.out.println(die);
                }
            } catch (InterruptedException e) {
                throw new IllegalStateException(e);
            }
        }

        System.out.println("Your result is " + result);
    }

}
