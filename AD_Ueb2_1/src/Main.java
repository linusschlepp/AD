import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws FileNotFoundException, IOException {

		Scanner input = new Scanner(System.in);
		BufferedReader bufferedReader = new BufferedReader(new FileReader(new File("/Users/linus/Desktop/Registermasch.txt")));
		String iter = " ";
		List<String> stringList = new ArrayList<String>();
		int akku = 0;
		int temp = 0;
		String tempString = "";
		boolean bool = true;
		//Dieses int-Array  stellt den Speicher dar
		int[] ram = new int[10];
		/**
		 * Schleife iteriert zeilenweise durch das Textdokument und speichert jede Zeile in der String-Liste
		 * (pro Index eine Zeile) 
		 */
		while ((iter = bufferedReader.readLine()) != null) {
			stringList.add(iter);
		}
		bufferedReader.close();

		
		//Diese Schleife iteriert durch die String-Liste
		for (int i = 0; i < stringList.size(); i++) {
			if (bool) {
				
				//Diese Schleife speichert die ersten drei Buchstaben der Zeile in einem String
				for (int j = 0; j < 3; j++) {

					tempString += stringList.get(i).charAt(j);
				}
				temp = getTemp(stringList.get(i));
				//switch-case, welcher die String-List auf die Anweisungen �berpr�ft
				switch (tempString) {
				case "ADD":
					akku += ram[temp];
					break;
				case "SUB":
					akku -= ram[temp];
					break;
				case "MUL":
					akku *= ram[temp];
					break;
				case "DIV":
					akku /= ram[temp];
					break;
				case "LDK":
					akku = temp;
					break;
				case "INP":
					akku = input.nextInt();
					break;
				case "LDA":
					akku = ram[temp];
					break;
				case "STA":
					ram[temp] = akku;
					break;
				case "JGE":
					if (akku >= 0) {
						i = temp - 1;
					}
					break;
				case "OUT":
					System.out.println(akku);
					break;
				case "HLT":
					bool = false;
					break;
				}
				tempString = "";
				temp = 0;
			} else {
				System.out.println("The program finished!");
				break;
			}

		}
	}

	
	//Diese Methode dient dazu, die Zahlenwerte hinter den Commands zu bekommen
	static int getTemp(String value) {

		String temp = "";

		for (int i = 4; i < value.length(); i++) {
			temp += value.charAt(i);
		}

		if (temp.isEmpty()) {
			return 0;
		} else {

			return Integer.valueOf(temp);
		}

	}
}
