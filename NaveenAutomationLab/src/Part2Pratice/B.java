package Part2Pratice;

public class B extends SuperKeywordConcept{
public B() {
	//super(10);//to go to parent class constructor,it wont call default constructor.
	super();//it calls default constructor
	
	System.out.println("child it is!");
}
public B(int a ) {
	super(20);//to go to parent class constructor,it wont call default constructor.
	//super();it calls default constructor
	
	System.out.println("child it is!");
}
public static void main(String[] args) {
	B obj=new B();
	B obj1=new B(20);
}
}
//sequence is :main method , object of B so control jumps to B
//B had extended SuperKeywordConcept so it will jump to SuperKeywordConcept and calls the defaults constructor
//if no function is specified in SuperKeywordConcept() it will jump back to B and print what ever is there in B