package app6;

class Z21
{
	static int i;
	static 
	{
		int i = 10;
	System.out.println("Z20.SIB:"+i);
	System.out.println("Z20.SIB:"+Z21.i);
	i=20;
	Z21.i=200;
	}
}
	
public  class Z20 {
static
{
	System.out.println("Z21.SIB");
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("main begin:");
System.out.println(Z21.i);
Z21.i =300;
System.out.println("-----------");
System.out.println(Z21.i);
Z21.i +=300;
System.out.println("-----------");
System.out.println(Z21.i);
System.out.println("main end");

	}
}