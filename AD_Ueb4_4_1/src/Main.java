import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
	
		
		LinkedList ll = new LinkedList();
		Node testNode = new Node();
		
	
		
		
		ll.add(7);
		ll.add(8);
		ll.add(53);
		ll.add(27);
		ll.add(387);
		ll.add(98);
		ll.insertAfter(27,  15);
		ll.printList();
		System.out.println("Nach sortieren:");
	//	QuickSortList qu = new QuickSortList(ll.convertToArray());
		//ll.sort(ll.convertToArray(), 0 , ll.convertToArray().length-1);
		
		testNode = ll.getNodeAt(3);
		System.out.println((int)testNode.getObj());
		ll.printList();
		ll.deleteList();
		System.out.println("Nach löschen der Liste: ");
		ll.printList();

	}

}
