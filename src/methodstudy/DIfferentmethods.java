package methodstudy;

public class DIfferentmethods 

{

	public static void test() 
	{
	System.out.println("my name is static");	
	}
	
	public void test2() 
	{
    System.out.println("my name is non static");
	}
	
	public static void test3(int a,int b) 
	{
		System.out.println("my value static parameterised ="+a+b);
	}
	public void test4(int x,int y)
	{
		System.out.println("my value is non static parameterised ="+x+y);
	}
	public static int test5() 
	{
		return 15*15;		
	}
	public int test6() 
	{
		return 30*15;		
	}
	public static int test7(int a,int b) 
	{
		return a+b;		
	}
	public int test8(int x,int y) 
	{
		return x+y;		
	}
}

