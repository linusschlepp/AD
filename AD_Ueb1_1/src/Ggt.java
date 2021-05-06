
public class Ggt {

	int a;
	int b;
	
	Ggt(int a, int b)
	{
		this.a = a;
		this.b = b;
		solve(a, b);
	}
	
	 void solve(int a, int b)
	{
		 int temp = a;
		 
	while(temp != 0)
	{
		temp = a%b;
		a= b;
		b=temp;
	}
	System.out.println("Groesster Teiler = "+a);
	
}
}


