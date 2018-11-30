package practice_1;

public class LoopingConcepts {

	public static void main(String[] args) {
	                   //to avoid writing syso many times we go for loops 
		              //1.while loop: initialization,conditional part,incremental/decremental part.
		              //print top 10 positive integers starting from 1
int i=1;
while(i<=10)           //it will print 1 and only if the condition is true it enters the loop 
{
	System.out.println(i);
	i=i+1;             //-ve infinte times the program gets executed if value is not incremented.
}
	System.out.println("******");
                      //2.for loop	
		
for(int j=1;j<=10;j++)
{
System.out.println(j);
	}
System.out.println("&&&&&&&&");
for(int j=10;j>=1;j--)
{
	System.out.println(j);
}
System.out.println("++++++++");
for(int k=10;k>=-10;k--) //
{
	System.out.println(k);
}
}
}