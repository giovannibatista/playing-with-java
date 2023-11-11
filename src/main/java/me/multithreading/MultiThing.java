package me.multithreading;

public class MultiThing extends Thread {

	private int id;

	public MultiThing(int id) {
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
