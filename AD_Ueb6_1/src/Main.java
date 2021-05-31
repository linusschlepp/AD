import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AVLTree tree = new AVLTree();
		

		int[] iArray = new int[] {7, 8, 5, 13 , 12, 15, 45, 17};
			

		iArray = tree.sort(iArray);
		System.out.println(Arrays.toString(iArray));
		

	}

}
