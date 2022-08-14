package methodstudy;

public class Calldifferentmethod {

	public static void main(String[] args) 
	{
	   DIfferentmethods d=new DIfferentmethods();
       System.out.println("Non static method");
       
	   d.test2();
	   d.test4(15, 20);
	   int value = d.test6();
	   System.out.println("value of return type Non static method ="+value);
	   int value1 = d.test8(20, 10);
	   System.out.println("value of return type with parameter non static method ="+value1);
	   
	   System.out.println("==========================");
	   
	   System.out.println("Static method");
	   
	   DIfferentmethods.test();
	   DIfferentmethods.test3(10, 20);
	   int value3 = DIfferentmethods.test5();
	   System.out.println("value of return type static method ="+value3);
	   int value4 =  DIfferentmethods.test7(25,25);
	   System.out.println("value of return type with parameter static method ="+value4);
	   
	}

}
