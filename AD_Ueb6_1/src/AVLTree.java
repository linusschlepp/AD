import static java.lang.Integer.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AVLTree {

	
	Node root;
	

	/**
	 * Method determines the height of the node
	 * 
	 * @param Node n, which height is getting determined
	 * @return height of the Node
	 */
	int height(Node N) {
		if (N == null)
			return 0;
		return N.height;
	}

	/**
	 * recursive Method to right rotate subtree
	 * 
	 * @param Node y
	 * @return Node x
	 */
	Node rightRotate(Node y) {
		Node x = y.left;
		Node T2 = x.right;

		// Perform rotation
		x.right = y;
		y.left = T2;

		// Update heights
		y.height = max(height(y.left), height(y.right)) + 1;
		x.height = max(height(x.left), height(x.right)) + 1;

		// Return new root
		return x;
	}

	/**
	 * recursive Method to left rotate subtree
	 * 
	 * @param Node y
	 * @return Node x
	 */
	Node leftRotate(Node x) {
		Node y = x.right;
		Node T2 = y.left;

		// Perform rotation
		y.left = x;
		x.right = T2;

		// Update heights
		x.height = max(height(x.left), height(x.right)) + 1;
		y.height = max(height(y.left), height(y.right)) + 1;

		// Return new root
		return y;
	}

	/**
	 * @param Node N
	 * @return the balance of Node N
	 */
	// Get Balance factor of node N
	int getBalance(Node N) {
		if (N == null)
			return 0;
		return height(N.left) - height(N.right);
	}

	void insert(int key) {
		root = insert(root, key);
	}

	/**
	 * recursive methods to insert nodes into the trees
	 * 
	 * @param node
	 * @param key
	 * @return node
	 */
	Node insert(Node node, int key) {
		/* 1. Perform the normal BST rotation */
		if (node == null)
			return (new Node(key));

		if (key < node.key)
			node.left = insert(node.left, key);
		else if (key > node.key)
			node.right = insert(node.right, key);
		else // Equal keys not allowed
			return node;

		/* 2. Update height of this ancestor node */
		node.height = 1 + max(height(node.left), height(node.right));

		/*
		 * 3. Get the balance factor of this ancestor node to check whether this node
		 * became Wunbalanced
		 */
		int balance = getBalance(node);

		// If this node becomes unbalanced, then
		// there are 4 cases Left Left Case
		if (balance > 1 && key < node.left.key)
			return rightRotate(node);

		// Right Right Case
		if (balance < -1 && key > node.right.key)
			return leftRotate(node);

		// Left Right Case
		if (balance > 1 && key > node.left.key) {
			node.left = leftRotate(node.left);
			return rightRotate(node);
		}

		// Right Left Case
		if (balance < -1 && key < node.right.key) {
			node.right = rightRotate(node.right);
			return leftRotate(node);
		}

		/* return the (unchanged) node pointer */
		return node;
	}

	/*
	 * Given a non-empty binary search tree, return the node with minimum key value
	 * found in that tree. Note that the entire tree does not need to be searched.
	 */
	Node minValueNode(Node node) {
		Node current = node;

		/* loop down to find the leftmost leaf */
		while (current.left != null)
			current = current.left;

		return current;
	}

	/**
	 * 
	 * find Nodes with a specific value
	 * 
	 * @param value
	 * @return Node with specific value
	 * @throws ElementNotFoundException
	 */
	private Node findNode(int value) throws ElementNotFoundException {
		Node node = root;
		try {
			while (true) {
				if (value == node.key)
					return node;
				if (value < node.key)
					node = node.left;
				if (value > node.key)
					node = node.right;
			}

		} catch (NullPointerException e) {
			throw new ElementNotFoundException();
		}

	}

	/**
	 * initiates the findNode method
	 * 
	 * @param key
	 * @throws ElementNotFoundException
	 */
	public void delete(int key) throws ElementNotFoundException {

		if (findNode(key) == null) {
		}

		root = deleteNode(root, key);
	}


	public int[] sort(int[] iArray) {

		List<Integer> list = new ArrayList<>();
		
		Arrays.stream(iArray).forEach(this::insert);

		return sort(root, list).stream().mapToInt(i -> i).toArray();

	}

	
	private List<Integer> sort(Node node, List<Integer> list) {
		
		if (node != null) {
			sort(node.left, list);
			list.add(node.key);
			sort(node.right, list);
		}
		
		return list;
	}



	/**
	 * 
	 * finds Node deletes it and restructures tree
	 * 
	 * @param root
	 * @param key
	 * @return root-Node
	 */

	Node deleteNode(Node root, int key) {
		// STEP 1: PERFORM STANDARD BST DELETE
		if (root == null)
			return root;

		// If the key to be deleted is smaller than
		// the root's key, then it lies in left subtree
		if (key < root.key)
			root.left = deleteNode(root.left, key);

		// If the key to be deleted is greater than the
		// root's key, then it lies in right subtree
		else if (key > root.key)
			root.right = deleteNode(root.right, key);

		// if key is same as root's key, then this is the node
		// to be deleted
		else {

			// node with only one child or no child
			if ((root.left == null) || (root.right == null)) {
				Node temp = null;
				if (temp == root.left)
					temp = root.right;
				else
					temp = root.left;

				// No child case
				if (temp == null) {
					temp = root;
					root = null;
				} else // One child case
					root = temp; // Copy the contents of
									// the non-empty child
			} else {

				// node with two children: Get the inorder
				// successor (smallest in the right subtree)
				Node temp = minValueNode(root.right);

				// Copy the inorder successor's data to this node
				root.key = temp.key;

				// Delete the inorder successor
				root.right = deleteNode(root.right, temp.key);
			}
		}

		// If the tree had only one node then return
		if (root == null)
			return root;

		// STEP 2: UPDATE HEIGHT OF THE CURRENT NODE
		root.height = max(height(root.left), height(root.right)) + 1;

		// STEP 3: GET THE BALANCE FACTOR OF THIS NODE (to check whether
		// this node became unbalanced)
		int balance = getBalance(root);

		// If this node becomes unbalanced, then there are 4 cases
		// Left Left Case
		if (balance > 1 && getBalance(root.left) >= 0)
			return rightRotate(root);

		// Left Right Case
		if (balance > 1 && getBalance(root.left) < 0) {
			root.left = leftRotate(root.left);
			return rightRotate(root);
		}

		// Right Right Case
		if (balance < -1 && getBalance(root.right) <= 0)
			return leftRotate(root);

		// Right Left Case
		if (balance < -1 && getBalance(root.right) > 0) {
			root.right = rightRotate(root.right);
			return leftRotate(root);
		}

		return root;
	}

}
