
public class Main {

	public static void main(String[] args) {
		
		
		Ggt ggt = new Ggt(32,40);
		
		
		Kgv kgv = new Kgv(35, 55);
		long timeStamp1 = System.currentTimeMillis();
		GgtRek ggt_rek = new GgtRek(80,20);
		long timeStamp2 = System.currentTimeMillis();
		System.out.println("delta "+ (timeStamp2-timeStamp1));

	}

}
