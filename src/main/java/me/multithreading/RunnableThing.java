package me.multithreading;

public class RunnableThing implements Runnable {

	private int id;

	public RunnableThing(int id) {
		this.id = id;
	}

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Id: %s - %s".formatted(id, i));
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}

		}
	}
}
