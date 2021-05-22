
public class Main {

	public static void main(String[] args) {

		Tree tree = new Tree();
		Tree2 tree2 = new Tree2();

		int in[] = new int[] { 4, 8, 2, 5, 1, 6, 3, 7 };
		int post[] = new int[] { 8, 4, 5, 2, 6, 7, 3, 1 };
		int pre[] = new int[] { 8, 4, 3, 5, 7, 6, 1, 2, };
		int n = in.length;
		Node root = null;

		int choice = 2;

		switch (choice) {
		case 1:
			System.out.println("From in - and post to Tree");
			root = tree.buildTree(in, post, n);
			tree.print(root);
			break;
		case 2:
			System.out.println("From pre - and post to Tree");
			root = tree2.buildTree(post, pre);
			tree2.print(root);
			break;
		}

	}
}