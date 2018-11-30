package Pratice_2;
//super keyword is always written in child class
//it should be the first statement in the child class
//inside a constructor you cannot have more than one super keyword
public class SuperKeywordConcept {
public SuperKeywordConcept()
{
	System.out.println("parent class it is ");
}
public SuperKeywordConcept(int a)
{
	System.out.println("parent class it is with a"+a);
}
public SuperKeywordConcept(int a,int b)
{
	System.out.println("parent class it is with a"+a);
	System.out.println("parent class it is with b"+b);
}
}
