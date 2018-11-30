package practice_1;
//Prgm to learn about data types
//class is a keyword
//main()is already defined in java which is the execution point of the pgm
//; should be provided for completing any statement.
//keywords must start with small letter
//you can print only after declaring the variables
public class DataType {

	public static void main(String[] args) {
		
		//Primitive datatype int,char,double,boolean.
		
		//1.int negative,positive,0.
		
		int i =10;//int i=20 error duplicate decalartion of local variable,variables should be unique
		
		i=20;//latest value of i will be taken
		System.out.println(i);//System is a class, println is a method.
	int j=30;
	System.out.println(i+j);
	
		//2.double
double d=11.22;//we are declaring but not using so its warning thats why yellow marks.
double d2=100;
System.out.println(d2);

//3.char any thing written within single quotes and it should be a single digit value.

char c='v';
char c2='1';
System.out.println(c2);
char c3='@';

//4.boolean true and false is both value and keyword

boolean b1=true;
boolean b2=false;


//5. string is a class not data type but it can be used as data type to store string values. 
//it should start with caps and enclosed within ""

String s="harish is a mad fellow";
String s2="he keeps shouting all the time";

	}

}
