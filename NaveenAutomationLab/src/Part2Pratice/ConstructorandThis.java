package Part2Pratice;
//whenever you want initialize the global variable to the current value of constructor we use this keyword
public class ConstructorandThis {
	String name; //class variables if we need to initialize these variables we use this keyword.
	int age; //this.global=local
	
public ConstructorandThis(String name,int age) {
this.name=name;
this.age=age;

System.out.println(name);
System.out.println(age);
}

	public static void main(String[] args) {
		ConstructorandThis obj1=new ConstructorandThis("shri",23); //shri is given to the local string variable 
		                                             //then it is assigned to the class variable using this keyword
		
	}

}
