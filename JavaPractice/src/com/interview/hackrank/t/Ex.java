package com.interview.hackrank.t;

class TestSeven extends Thread {

	private static int x;

	public synchronized void doThings() {

		int current = x;

		current++;

		x = current;

	}

	public void run() {

		doThings();

	}

}

public class Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
