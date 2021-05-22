import java.util.HashSet;
import java.util.Stack;

class Tree {
	 Node buildTree(int in[], int post[], int n) {

		// Create Stack of type Node*
		Stack<Node> st = new Stack<>();

		// Create HashSet of type Node*
		HashSet<Node> s = new HashSet<>();

		// Initialise postIndex with n - 1
		int postIndex = n - 1;

		// Initialise root with null
		Node root = null;

		for (int p = n - 1, i = n - 1; p >= 0;) {

			// Initialise node with NULL
			Node node = null;

			// Run do-while loop
			do {

				// Initialise node with
				// new Node(post[p]);
				node = new Node(post[p]);

				// Check is root is
				// equal to NULL
				if (root == null) {
					root = node;
				}

				// If size of set
				// is greater than 0
				if (st.size() > 0) {

					// If st.peek() is present in the
					// set s
					if (s.contains(st.peek())) {
						s.remove(st.peek());
						st.peek().left = node;
						st.pop();
					} else {
						st.peek().right = node;
					}
				}
				st.push(node);

			} while (post[p--] != in[i] && p >= 0);

			node = null;

			// If the stack is not empty and
			// st.top().data is equal to in[i]
			while (st.size() > 0 && i >= 0 && st.peek().val == in[i]) {
				node = st.peek();

				// Pop elements from stack
				st.pop();
				i--;
			}

			// If node not equal to NULL
			if (node != null) {
				s.add(node);
				st.push(node);
			}
		}

		// Return root
		return root;
	}

	// For print preOrder Traversal
	 void preOrder(Node node) {
		if (node == null)
			return;

		System.out.printf("%d ", node.val);
		preOrder(node.left);
		preOrder(node.right);
	}
	 
	 
	 public void print(Node root) {
		  	if(root != null)
		  	{
		  		System.out.print("(");
		  		print(root.left);
		  		System.out.print(","+root.val+",");
		  		print(root.right);
		  		System.out.print(")");
		  	}
		  	else {
		  		System.out.print("n");
		  	}
		  	
		  }
}