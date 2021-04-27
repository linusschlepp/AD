
public class Main {

	public static void main(String[] args) {
		
		
		Ggt ggt = new Ggt(32,40);
		
		
		Kgv kgv = new Kgv(35, 55);
		long timestamp1 = System.currentTimeMillis();
		Ggt_rek ggt_rek = new Ggt_rek(80,20);
		long timestamp2 = System.currentTimeMillis();
		System.out.println("delta "+ (timestamp2-timestamp1));

	}

}
