package Pratice_2;

public class Car { //class is a entity where we define property , variables etc.
//global variables
	int mod;//these two objects copy will be given to each of the corresponding objects.
	int wheel;
	public static void main(String[] args) {
	Car a=new Car();//rhs is object ;
	                  //lhs is a is representing the object reference 	
	Car b=new Car(); //new operator /keyword is used to create the object a,b,c are object reference variable
	Car c=new Car();
	
	a.mod=2012;
	a.wheel=4;
	
	b.mod=2018;
	b.wheel=4;
	
	c.mod=2019;
	c.wheel=4;
	System.out.println(a.mod);
	System.out.println(a.wheel);//similar for b and c object
	
	}

}
