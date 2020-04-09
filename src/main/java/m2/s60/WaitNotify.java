package m2.s60;

public class WaitNotify {
	public static void main(String[] args) {
		Worker worker = new Worker();
		worker.start();

		synchronized (worker) {
			try {
				System.out.println("Wait for the job");
				worker.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			System.out.println("Work is done? " + worker.isDone());
		}
	}
}

class Worker extends Thread {
	private boolean done;

	@Override
	public synchronized void run() {
		done = true;
		notify();
	}

	public boolean isDone() {
		return done;
	}
}