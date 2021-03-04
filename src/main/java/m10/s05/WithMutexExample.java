package m10.s05;

public class WithMutexExample {
    private Object mutexF = new Object();
    private Object mutexG = new Object();

    public static void main(String[] args) {
        WithMutexExample wme = new WithMutexExample();

        Thread[] threads = { //
                new Thread(new WMRunner(wme, WMMode.ON_THIS)), //
                new Thread(new WMRunner(wme, WMMode.ON_MUTEX_F)), //
                new Thread(new WMRunner(wme, WMMode.ON_MUTEX_G)), //
                new Thread(new WMRunner(wme, WMMode.ON_THIS)), //
                new Thread(new WMRunner(wme, WMMode.ON_MUTEX_F)), //
                new Thread(new WMRunner(wme, WMMode.ON_MUTEX_G)) //
        };

        for (Thread t : threads) {
            t.start();
        }

        for (Thread t : threads) {
            try {
                t.join();
            } catch (InterruptedException e) {
                System.out.println("Join interrupted on " + t.getName());
                Thread.currentThread().interrupt();
            }
        }
        System.out.println("Main thread done");
    }

    public synchronized void syncOnThis() {
        System.out.println("Enter syncOnThis() for " + Thread.currentThread().getName());

        try {
            // !!! job simulation - don't do this in production code !!!
            Thread.sleep(200);
        } catch (InterruptedException e) {
            System.out.println("Sleep interrupted on syncOnThis()");
            Thread.currentThread().interrupt();
        }

        System.out.println("Exit syncOnThis() for " + Thread.currentThread().getName());
    }

    public void syncOnMutexF() {

        synchronized (mutexF) {
            System.out.println("Enter monitor in syncOnMutexF() for " + Thread.currentThread().getName());

            try {
                // !!! job simulation - don't do this in production code !!!
                Thread.sleep(200);
            } catch (InterruptedException e) {
                System.out.println("Sleep interrupted on syncOnMutexF()");
                Thread.currentThread().interrupt();
            }

            System.out.println("Exit monitor in syncOnMutexF() for " + Thread.currentThread().getName());
        }
    }

    public void syncOnMutexG() {

        synchronized (mutexG) {
            System.out.println("Enter monitor in syncOnMutexG() for " + Thread.currentThread().getName());

            try {
                // !!! job simulation - don't do this in production code !!!
                Thread.sleep(200);
            } catch (InterruptedException e) {
                System.out.println("Sleep interrupted on syncOnMutexG()");
                Thread.currentThread().interrupt();
            }

            System.out.println("Exit monitor in syncOnMutexG() for " + Thread.currentThread().getName());
        }
    }
}
