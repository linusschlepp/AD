import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class Main {

	public static void main(String[] args) {

		RingList rl = createList();
		rl.printList();
		int[] numbers = new int[6];

		for (int i = 0; i < 6; i++) {
			numbers[i] = getRandomNumber(rl);
		}

		System.out.println("Numbers which were pulled: " + Arrays.toString(numbers));
		rl.printList();
	}

	public static RingList createList() {

		RingList rl = new RingList();

		for (int i = 1; i <= 49; i++)
			rl.add(i);

		return rl;
	}

	public static int getRandomNumber(RingList rl) {
		int index = ThreadLocalRandom.current().nextInt(1, rl.getSize());
		Node element = rl.getNodeAt(index);
		rl.delete(element.getValue());
		return element.getValue();
	}

}
