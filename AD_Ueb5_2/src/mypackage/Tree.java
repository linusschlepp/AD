package mypackage;
import java.util.HashMap;

public class Tree {

		static int preindex; 
	
	static Node constructTreeUtil(int pre[], int post[], int l, int h, int size) {

// Base case
		if (preindex >= size || l > h)
			return null;

// The first node in preorder traversal is
// root. So take the node at preIndex from
// preorder and make it root, and increment
// preIndex
		Node root = new Node(pre[preindex]);
		preindex++;

// If the current subarry has only one
// element, no need to recur or
// preIndex > size after incrementing
		if (l == h || preindex >= size)
			return root;
		int i;

// Search the next element of pre[] in post[]
		for (i = l; i <= h; i++) {
			if (post[i] == pre[preindex])
				break;
		}
// Use the index of element found in
// postorder to divide postorder array
// in two parts. Left subtree and right subtree
		if (i <= h) {
			root.left = constructTreeUtil(pre, post, l, i, size);
			root.right = constructTreeUtil(pre, post, i + 1, h, size);
		}
		return root;
	}

// The main function to construct Full
// Binary Tree from given preorder and
// postorder traversals. This function
// mainly uses constructTreeUtil()
	static Node constructTree(int pre[], int post[], int size) {
		preindex = 0;
		return constructTreeUtil(pre, post, 0, size - 1, size);
	}

	static void printInorder(Node root) {
		if (root == null)
			return;
		printInorder(root.left);
		System.out.print(root.data + " ");
		printInorder(root.right);
	}
}
