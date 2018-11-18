package Practice;

public class IfelseConcepts {

	public static void main(String[] args) {
		int a=100;
		int b=300;
		if(a>b) {
		System.out.println("a is greater");

	}
		else {
			System.out.println("b is greater");
		}
//= is assigning the value of a to b ,== comparision, < , > , != ,<= , >= 
		
		if(a==b)
		{
			System.out.println("a and b are equal");
			
		}
		else
		{
			System.out.println("not equal");
		}
		
		int a1=300;
		int b1=400;
		int c1=500;
		if(a1>b1 & a1>c1)//f&f=f , t&t=t , f&t=f , t&f=f
		{
			System.out.println("a1 is greater");
		}
		else if(b1>c1) {
			System.out.println("b1 is greater");
		}
		else 
		{
			System.out.println("c1 is greater");
		}
}
}