package app6;

class Z16
{
	static int i;
	static {
	System.out.println("Z16.SIB");
	}
}
	
public class Z17 {
static
{
	System.out.println("Z17.SIB");
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("main begin:");
System.out.println(Z16.i);
System.out.println("main end");

	}
}