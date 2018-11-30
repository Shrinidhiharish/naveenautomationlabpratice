package practice_1;

public class IncrementDecrement {

	public static void main(String[] args) {
	int i=1;
	int j=i++;//post increment :first give value of i to j so j is 1 
	           //increase the value of i by 1 
	System.out.println(i);
	System.out.println(j);
	
	int a=1;
	int b=++a;
	System.out.println(a);//pre-increment
	System.out.println(b);
	
	int x=10;
	int y=x--;
	System.out.println(x);
	System.out.println(y);
	
	/*int n=20;
	int m=--n;
	System.out.println(n);
	System.out.println(m);
	
	
*/
	}

}
