package Inventory;

import java.text.DecimalFormat;

public class Queue {
	private int maxSize;

	private long[] queArray;

	private int front;

	private int rear;

	private int nItems;

	public Queue(int s) {
		maxSize = s;
		queArray = new long[maxSize];
		front = 0;
		rear = -1;
		nItems = 0;
	}

	// put item at end of a queue
	public void insert(long j) {
		if (rear == maxSize - 1) // deal with wraparound
			rear = -1;
		queArray[++rear] = j; // increment rear and insert
		nItems++;
	}

	// take item from front of queue
	public long remove() {
		long temp = queArray[front++]; // get value and incr front
		if (front == maxSize) // deal with wraparound
			front = 0;
		nItems--; // one less item
		return temp;
	}

	public long peekFront() {
		return queArray[front];
	}

	public boolean isEmpty() {
		return (nItems == 0);
	}

	public boolean isFull() {
		return (nItems == maxSize);
	}

	public int size() {
		return nItems;
	}

	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("#,###.00");
		Queue theQueue = new Queue(5); // queue holds 5 items

		long n;
		long purchases = 0;
		long amountSold = 0, begInv, endInv;

		theQueue.insert(400);
		theQueue.insert(400); // (wraps around)
		theQueue.insert(500);
		theQueue.insert(500);
		theQueue.insert(600);
		// display entire queue
		while (!theQueue.isEmpty()) {
			n = theQueue.remove();
			System.out.println(n);
		}
		// evaluate inventory
		for (int i = 1; i <= 5; i++) {
			n = theQueue.remove();
			purchases += n;
			if (i < 4)
				amountSold += n;
		}
		begInv = purchases;
		endInv = (purchases - amountSold);

		System.out.println("COGS: $" + amountSold + "\nProfit: $" + (purchases - amountSold) + "\nEnd. Inv: $" + endInv
				+ "\nInventory turnover: " + df.format(amountSold / ((begInv + endInv) / 2.0)));

	}
}