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

	/*
	 * public int[] convertToArray() {
	 * 
	 * Node le = startNode; int temp = 0; int[] retArray = new int[getSize()]; int
	 * counter = 0;
	 * 
	 * while (le != null) { temp = (int) le.getObj();
	 * 
	 * retArray[counter] = temp; le = le.getNextNode(); counter++; }
	 * 
	 * return retArray;
	 * 
	 * }
	 */
	public int getSize() {
		int sizeCounter = 0;
		Node le = startNode;

		while (le != null) {
			sizeCounter++;

			le = le.getNextNode();
		}

		return sizeCounter;
	}
	/*
	 * public boolean find(Object o) { Node le = startNode; while (le != null) { if
	 * (le.getObj().equals(o)) return true; le = le.nextElem; } return false; }
	 */

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
			System.out.print(le.getObj() + ", ");
			le = le.getNextNode();
		}
		System.out.println();
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

	public Node findPreviousNode(Node node) {

		Node temp = startNode;
		while (temp.getNextNode() != null && !(temp.getNextNode().equals(node))) {
			temp = temp.getNextNode();
		}
		return temp;
	}

	public void swapNodes(int location1, int location2) {

		if (location1 > getSize() || location2 > getSize())
			throw new IndexOutOfBoundsException();

		Node swapNode1, swapNode2;

		if (location1 < location2) {
			swapNode1 = getNodeAt(location1);
			swapNode2 = getNodeAt(location2);

		} else if (location1 > location2) {
			swapNode1 = getNodeAt(location2);
			swapNode2 = getNodeAt(location1);

		} else
			return;

		Node swapNode1Previous = findPreviousNode(swapNode1);
		Node swapNode2Previous = findPreviousNode(swapNode2);

		Node swapNode1Next = swapNode1.getNextNode();
		Node swapNode2Next = swapNode2.getNextNode();

		if (swapNode1.equals(startNode) && swapNode2.getNextNode() == null) {

			swapNode1.setNextNode(null);
			swapNode2Previous.setNextNode(swapNode1);
			swapNode2.setNextNode(swapNode1Next);
			startNode = swapNode2;

		} else if (swapNode1.getNextNode() == swapNode2) {
			if (swapNode1.equals(startNode)) {
				swapNode1.setNextNode(swapNode2Next);
				swapNode2.setNextNode(swapNode1);
				startNode = swapNode2;

			} else if (swapNode2.getNextNode() == null) {
				swapNode1.setNextNode(null);
				swapNode2.setNextNode(swapNode1);
				swapNode1Previous.setNextNode(swapNode2);
			} else {
				swapNode1.setNextNode(swapNode2Next);
				swapNode1Previous.setNextNode(swapNode2);;
				swapNode2.setNextNode(swapNode1);
			}

		} else if (swapNode1.equals(startNode)) {

			swapNode1.setNextNode(swapNode2Next);
			swapNode2Previous.setNextNode(swapNode1);
			swapNode2.setNextNode(swapNode1Next);
			startNode = swapNode2;

		} else if (swapNode2.getNextNode() == null) {

			swapNode1.setNextNode(null);
			swapNode1Previous.setNextNode(swapNode2);
			swapNode2Previous.setNextNode(swapNode1);
			swapNode2.setNextNode(swapNode1Next);

		} else {

			swapNode1.setNextNode(swapNode2Next);
			swapNode1Previous.setNextNode(swapNode2);
			swapNode2.setNextNode(swapNode1Next);
			swapNode2Previous.setNextNode(swapNode1);
		}

	}

	public void sort() { quickSort(1, getSize()); }
	
	
	private void quickSort(int firstNode, int lastNode)
	{
		int part = 0;
		if (firstNode <= lastNode) {
			part = preparePartition(firstNode, lastNode, part);
			// Sortiert werte links
			quickSort(firstNode, part - 1);
			// Sortiert werte rechts
			quickSort(part + 1, lastNode);

		}
		
	}

	private int preparePartition(int firstNode, int lastNode, int part) {

		int pivot = (int) getNodeAt(firstNode).getObj();
		part = firstNode - 1;

		for (int i = firstNode; i <= lastNode; i++) {
			if ((int) (getNodeAt(i).getObj()) <= pivot) {
				part++;
				swapNodes(i, part);
			}
		}

		swapNodes(part, firstNode);

		return part;
	}

}
