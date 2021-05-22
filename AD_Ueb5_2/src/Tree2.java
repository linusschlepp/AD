import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class Tree2 {

	
	  static Set<Node> set = new HashSet<>();
	    static Stack<Node> stack = new Stack<>();
	 
	    // Function to build tree using given traversal
	    public Node buildTree(int[] preorder, int[] inorder)
	    {
	 
	        Node root = null;
	        for (int pre = 0, in = 0; pre < preorder.length;) {
	 
	            Node node = null;
	            do {
	                node = new Node(preorder[pre]);
	                if (root == null) {
	                    root = node;
	                }
	                if (!stack.isEmpty()) {
	                    if (set.contains(stack.peek())) {
	                        set.remove(stack.peek());
	                        stack.pop().right = node;
	                    }
	                    else {
	                        stack.peek().left = node;
	                    }
	                }
	                stack.push(node);
	            } while (preorder[pre++] != inorder[in] && pre < preorder.length);
	 
	            node = null;
	            while (!stack.isEmpty() && in < inorder.length &&
	                    stack.peek().val == inorder[in]) {
	                node = stack.pop();
	                in++;
	            }
	 
	            if (node != null) {
	                set.add(node);
	                stack.push(node);
	            }
	        }
	 
	        return root;
	    }
	 
	    // Function to print tree in Inorder
	    void printInorder(Node node)
	    {
	        if (node == null)
	            return;
	 
	        /* first recur on left child */
	        printInorder(node.left);
	 
	        /* then print the data of node */
	        System.out.print(node.val + " ");
	 
	        /* now recur on right child */
	        printInorder(node.right);
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
