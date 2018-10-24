package app6;

public class Q {
static int x = 10;
static void test()
{
	int x = 20;
	x = 40;
	Q.x = 60;
	System.out.println(x);
	
}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("main"+x);
test();
System.out.println("main end "+x);

	}

}
