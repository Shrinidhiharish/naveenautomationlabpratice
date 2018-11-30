package practice_1;

public class ArrayConcepts {

	public static void main(String[] args) {
		//1 D array
		// +ve multiple values can be stored in same variable of similar data types 
		//- ve fixed size static to overcome this we use collections arraylist ,hashtable
		//only similar data can be stored. to overcome this we use object array 
		//storing similar data type values in a variable
		//1.int array
		
		int a[]=new int[4];
		a[0]=4;
		a[1]=5;
		a[3]=7;
		a[2]=8;
		System.out.println(a[2]);
		//System.out.println(a[4]);//ArrayIndexOutOfBoundException
		
		
		System.out.println(a.length);//size of array
		//highest index is n-1,lowest is 0 where n is size of array
		
		
		//for printing all the values use for loop
		for(int j=0;j<a.length;j++)
		{
			System.out.println(a[j]);
		}
		
		
		//2.double array
		//3. char array
		//4.boolean array
		//5.String array 
		
		
		boolean b[]=new boolean[2];
		b[0]=true;
		b[1]=false;
		
		
		//6. Object array:(object is call) used to store different data type values.
		Object ob[]=new Object[4];
		ob[0]="shrinidhi";
		ob[1]=22;
		ob[2]=13.380;
		ob[3]='F';
		System.out.println(ob[0]);
		System.out.println(ob.length);
	}
}
