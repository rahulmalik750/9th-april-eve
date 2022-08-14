package methodstudy;

public class Staticmethodparameterandreturntype 
{
	public static void Display() 
	{
	   int a=10;
	   int b=20;
	   int sum=a+b;	  
	   System.out.println(sum);
	}
	
	public static void Display1(int a,int b,int c) 
	{
		
		int sum1 = a+b+c;
		System.out.println("my value is "+sum1);
	}
	
	public static void Display2(String a, String b, String c) 
	{
		System.out.println("the name "+a+b+c);
	}
	
	public static int Display3() 
	{
		return 10*20;			
	}
	
	public static String Display4(String a, String b, String c) 
	{
		return a+b+c;
		
	}
	public static void main(String[] args) 
	{
		Display();
		Display1(10, 20, 13);
		Display2("Rahul " , "R ", "malik");
		Display3();
		System.out.println("the value is "+Display3());
		String name = Display4("Rahul","R","Nalik");
		System.out.println(name);
	}
}
