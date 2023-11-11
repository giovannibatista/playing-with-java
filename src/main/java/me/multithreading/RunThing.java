package me.multithreading;

public class RunThing {

	public static void main(String[] args) {
		for (int i = 1; i < 5; i++) {
			MultiThing multiThing = new MultiThing(i);
			multiThing.start();
		}
		for (int i = 1; i < 5; i++) {
			RunnableThing run = new RunnableThing(i);
			Thread myThread = new Thread(run);
			myThread.start();
			try {
				myThread.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
