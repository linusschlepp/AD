import java.util.*;

public class LinkedList {

	static int counter = 0;

	Node startNode;
	int[] a;

	public void add(Object o) {

		if (counter == 0) {
			startNode = new Node(o);
			counter++;
		} else {
			Node newElem = new Node(o);
			Node lastElem = getLastNode();
			lastElem.setNextNode(newElem);
		}

	}

	public void insertAfter(Object prevItem, Object newItem) {
		Node newElem, nextElem, pointerElem;
		pointerElem = startNode.getNextNode();
		while (pointerElem != null && !pointerElem.getObj().equals(prevItem)) {
			pointerElem = pointerElem.getNextNode();
		}
		newElem = new Node(newItem);
		nextElem = pointerElem.getNextNode();
		pointerElem.setNextNode(newElem);
		newElem.setNextNode(nextElem);
	}

	public void delete(Object o) {
		Node le = startNode;

		if (le.equals(o)) {
			startNode = null;
			return;
		}

		while (le.getNextNode() != null && !le.getObj().equals(o)) {
			if (le.getNextNode().getObj().equals(o)) {
				if (le.getNextNode().getNextNode() != null)
					le.setNextNode(le.getNextNode().getNextNode());
				else {
					le.setNextNode(null);
					break;
				}
			}
			le = le.getNextNode();
		}
	}

	public void deleteList() {
		Node le = startNode;
		Node temp;

		while (le != null) {

			temp = le;
			le = null;
			le = temp.getNextNode();

		}
	}

	public int[] convertToArray() {

		Node le = startNode;
		int temp = 0;
		int[] retArray = new int[getSize()];
		int counter = 0;

		while (le != null) {
			temp = (int) le.getObj();

			retArray[counter] = temp;
			le = le.getNextNode();
			counter++;
		}

		return retArray;

	}

	public int getSize() {
		int sizeCounter = 0;
		Node le = startNode;

		while (le != null) {
			sizeCounter++;

			le = le.getNextNode();
		}

		return sizeCounter;
	}

	public boolean find(Object o) {
		Node le = startNode;
		while (le != null) {
			if (le.getObj().equals(o))
				return true;
			le = le.nextElem;
		}
		return false;
	}

	public Node getFirstNode() {
		return startNode;
	}

	public void setFirstElem(Node startNode) {
		this.startNode = startNode;
	}

	public Node getLastNode() {
		Node le = startNode;
		while (le.getNextNode() != null) {
			le = le.getNextNode();
		}
		return le;
	}

	public void printList() {
		Node le = startNode;
		while (le != null) {
			System.out.println(le.getObj());
			le = le.getNextNode();
		}
	}

	public Node getNodeAt(int location) {

		Node temp = null;
		Node le = startNode;
		int counter = 0;
		if (location > getSize())
			return null;
		else {
			while (counter != location) {
				temp = le;
				le = le.getNextNode();

				counter++;
			}
		}

		return temp;
	}
	
	public void swapNodes(int location1, int location2)
	{
		Node temp = getNodeAt(location1);
		Node temp2 = getNodeAt(location2);
		Node le = startNode;
		int counter = 0;
		
		while(le.getNextNode() != null && temp.equals(temp2))
			
		
		
	}

	
	public void sort() {
		this.a = a;

		
		Node f = startNode;
		Node l = getNodeAt(getSize());
		int part = 0;
		if ((int) f.getObj() < (int) l.getObj()) {
			part = preparePartition(f, l, part);
			// Sortiert werte links
			sort(a, f, part - 1);
			// Sortiert werte rechts
			sort(a, part + 1, l);

		}
		System.out.println(Arrays.toString(a));
	}


	public int preparePartition(Node f, Node l, int part) {

	
		
		
		Node temp = null;
		Node pivot = getNodeAt(0);
		part = 0 - 1;

		for (int i = (int) f.getObj(); i <= (int) l.getObj(); i++) {
			if ((int) (getNodeAt(i).getObj())<= (int) pivot.getObj()) {
				part++;
				temp = a[part];
				a[part] = a[i];
				a[i] = temp;

			}
		}

		temp = a[part];
		a[part] = a[f];
		a[f] = temp;

		return part;
	}

}
