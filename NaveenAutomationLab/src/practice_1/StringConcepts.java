package practice_1;

public class StringConcepts {
//+ is called concatenation operator
	public static void main(String[] args) {
		int s=200;
		int n=400;
		
		String a="make today";
		String b=" amanzing";
		
		double d=12.11;
		double d2=33.33;
		
		
		System.out.println(s+n);
		System.out.println(a+b);
		System.out.println(d+d2);
		System.out.println(a+b+d);
		System.out.println(s+n+a+b);
		System.out.println(a+b+s+n);//remember execution is always from left to right a+b=make today amazing
		                          //it is added to 200 so op will be make today amazing 200400		
	
	System.out.println(a+b+(s+n));
	System.out.println(a+b+s+a+n+a+b+s+n);
	
	System.out.println("the value of life is in how you" +(a+b));
	
	System.out.print("hey cutiee :) ");//println is used to get to new line in console
	System.out.println("how you been?");//print is without new line
	}

}
