package mypackage;

public class Main {

	public static void main(String[] args) {

		PriorityQueue pq = new PriorityQueue();
		pq.insert(new Element(17));
		pq.insert(new Element(15));
		pq.insert(new Element(2));
		pq.insert(new Element(8));
		pq.insert(new Element(1));
		pq.insert(new Element(0));
		pq.insert(new Element(19));
		pq.insert(new Element(7));
		pq.insert(new Element(-1));
		pq.insert(new Element(30));

		pq.printQueue();

		System.out.println("Smallest element: " + pq.getMin().getKey());
		System.out.println("Smallest element gets extracted: " + pq.extractMin().getKey());
		
		pq.decreaseKey(3, 3);
		
		System.out.println();

		pq.printQueue();

	}

}
