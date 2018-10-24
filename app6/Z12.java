package app6;

public class Z12 {
static int i = test();
static
{
	System.out.println("Z12.SIB"+i);
	i = 99;
	main(null);
	System.out.println("Z12.SIB again:"+i);
	i = 10;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("main begin:"+i);
i = 33;
System.out.println("main end"+i);

	}
public static int test()
{
	System.out.println("test:"+i);
 i = 40;
 main(null);
 System.out.println("test again" + i);
 return 75;
			
}
}
