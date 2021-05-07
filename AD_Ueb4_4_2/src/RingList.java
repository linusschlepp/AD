import java.util.Arrays;

public class RingList {

	Node startNode = null;

	public void add(int value) {

		if (isEmpty()) {
			startNode = new Node(value);
			startNode.setNextNode(startNode);

		} else {
			Node newNode = new Node(value);
			getPrevNode(startNode).setNextNode(newNode);
			newNode.setNextNode(startNode);

		}
	}

	public void delete(int value) {
		Node le = startNode;

		if (le.getValue() == value)
			startNode = startNode.getNextNode();

		while (le.getValue() != value)
			le = le.getNextNode();

		getPrevNode(le).setNextNode(le.getNextNode());

	}

	public boolean isEmpty() {
		if (getSize() == 0)
			return true;
		else
			return false;

	}

	public void deleteList() {
		Node le = startNode;
		for (int i = 1; i <= getSize(); i++) {
			delete(getNodeAt(i).getValue());
			le = le.getNextNode();
		}
	}

	public int[] convertToIntArray() {

		Node le = startNode;
		int[] retArray = new int[getSize()];
		int counter = 0;

		while (le != null) {
			retArray[counter] = le.getValue();
			le = le.getNextNode();
			counter++;
		}

		return retArray;

	}

	public int getSize() {
		
		if (startNode == null)
			return 0;
		int sizeCounter = 1;
		Node le = startNode;

		while (le.getNextNode() != startNode) {
			sizeCounter++;

			le = le.getNextNode();
		}

		return sizeCounter;
	}

	public Node getFirstNode() {
		return startNode;
	}

	private void setFirstNode(Node startNode) {
		this.startNode = startNode;
	}

	public Node getLastNode() {
		Node le = startNode;
		while (le.getNextNode() != startNode) {
			le = le.getNextNode();
		}
		return le;
	}

	public void printList() {
		Node le = startNode;

		int[] valueArray = new int[getSize()];

		for (int i = 0; i < valueArray.length; i++)
			valueArray[i] = getNodeAt(i + 1).getValue();

		System.out.println(Arrays.toString(valueArray));

	}

	public Node getNodeAt(int location) {

		Node temp = null;
		Node le = startNode;
		int counter = 0;
		if (location > getSize())
			throw new IndexOutOfBoundsException();
		else {
			while (counter != location) {
				temp = le;
				le = le.getNextNode();

				counter++;
			}
		}

		return temp;
	}

	public Node getPrevNode(Node node) {

		Node temp = startNode;
		while (!(temp.getNextNode().equals(node))) {
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
		// Knoten werden auf VorgängerKnoten gesetzt
		Node swapNode1Previous = getPrevNode(swapNode1);
		Node swapNode2Previous = getPrevNode(swapNode2);
		// Knoten werden auf NachfolgerKnoten gesetzt
		Node swapNode1Next = swapNode1.getNextNode();
		Node swapNode2Next = swapNode2.getNextNode();

		// Sonderfälle:
		// Knoten1 ist der erste- und Knoten2 der letzte Knoten
		if (swapNode1.equals(startNode) && swapNode2.getNextNode() == null) {
			swapNode1.setNextNode(null);
			swapNode2Previous.setNextNode(swapNode1);
			swapNode2.setNextNode(swapNode1Next);
			startNode = swapNode2;

			// Die zwei Knoten liegen nebeneinander
		} else if (swapNode1.getNextNode() == swapNode2) {
			/*
			 * Die zwei Knoten liegen nebeneinander und Knoten1 ist der erste Knoten in der
			 * Liste
			 */
			if (swapNode1.equals(startNode)) {
				swapNode1.setNextNode(swapNode2Next);
				swapNode2.setNextNode(swapNode1);
				startNode = swapNode2;

				/*
				 * Die zwei Knoten liegen nebeneinander und Knoten2 ist der letzte Knoten in der
				 * Liste
				 */
			} else if (swapNode2.getNextNode() == null) {
				swapNode1.setNextNode(null);
				swapNode2.setNextNode(swapNode1);
				swapNode1Previous.setNextNode(swapNode2);
			} else {
				swapNode1.setNextNode(swapNode2Next);
				swapNode1Previous.setNextNode(swapNode2);
				swapNode2.setNextNode(swapNode1);
			}

			// Der zu tauschende Knoten1 ist der erste Knoten in der Liste
		} else if (swapNode1.equals(startNode)) {
			swapNode1.setNextNode(swapNode2Next);
			swapNode2Previous.setNextNode(swapNode1);
			swapNode2.setNextNode(swapNode1Next);
			startNode = swapNode2;

			// Der zu tauschende Knoten2 ist der letzte Knoten in der Liste
		} else if (swapNode2.getNextNode() == null) {
			swapNode1.setNextNode(null);
			swapNode1Previous.setNextNode(swapNode2);
			swapNode2Previous.setNextNode(swapNode1);
			swapNode2.setNextNode(swapNode1Next);
			/*
			 * Die zwei Knoten sind in der Liste verteilt bzw entsprechen nicht den ersten
			 * bzw. letzten Knoten in der Liste
			 */
		} else {
			swapNode1.setNextNode(swapNode2Next);
			swapNode1Previous.setNextNode(swapNode2);
			swapNode2.setNextNode(swapNode1Next);
			swapNode2Previous.setNextNode(swapNode1);
		}

	}

	public void sort() {
		quickSort(1, getSize());
	}

	private void quickSort(int firstNode, int lastNode) {
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

		int pivot = getNodeAt(firstNode).getValue();
		part = firstNode - 1;

		for (int i = firstNode; i <= lastNode; i++) {
			if (getNodeAt(i).getValue() <= pivot) {
				part++;
				swapNodes(i, part);
			}
		}

		swapNodes(part, firstNode);

		return part;
	}

}
