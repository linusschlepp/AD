
public class Main {

	public static void main(String[] args) throws ElementNotFoundException {
		AVLTree tree = new AVLTree();
	

		tree.insert(5);
		tree.insert(4);
		tree.insert(10);
		tree.insert(6);
		tree.insert(7);
		tree.insert(15);
		tree.insert(3);


		tree.print();
		tree.delete(10);
		tree.delete(6);
		tree.delete(7);
		tree.delete(5);
		tree.delete(3);
		System.out.println();
		tree.print();


	}
}
