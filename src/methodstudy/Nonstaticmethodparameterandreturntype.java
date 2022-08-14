package methodstudy;

public class Nonstaticmethodparameterandreturntype 
{
	public void Display() 
	{
	   int a=10;
	   int b=20;
	   int sum=a+b;	  
	   System.out.println(sum);
	}
	
	public void Display1(int a,int b,int c) 
	{
		
		int sum1 = a+b+c;
		System.out.println("my value is "+sum1);
	}
	
	public void Display2(String a, String b, String c) 
	{
		System.out.println("the name "+a+b+c);
	}
	
	public int Display3() 
	{
		return 120*20;			
	}
	
	public String Display4(String a, String b, String c) 
	{
		return a+b+c;
		
	}
	public static void main(String[] args) // Main method
	{
		Nonstaticmethodparameterandreturntype Non=new Nonstaticmethodparameterandreturntype();// Create object
		
		Non.Display();
		Non.Display1(110, 20, 13);
		Non.Display2("Rahul " , "Rajendra ", "Malik");
		Non.Display3();
		System.out.println("The value is "+Non.Display3());
		String name = Non.Display4("Teju ","R ","Malik");
		System.out.println(name);
	}
}
