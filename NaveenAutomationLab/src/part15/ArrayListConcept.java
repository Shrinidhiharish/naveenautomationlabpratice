package part15;
import java.util.ArrayList;
public class ArrayListConcept {

	public static void main(String[] args) {
		
		ArrayList obj=new ArrayList();
		obj.add(20);//0
		obj.add(30);//1
		obj.add(200);//2
		System.out.println(obj.size());
		
		obj.add(400);//3
		obj.add(22);//4
		System.out.println(obj.size());
		
		obj.add("tom");//5
		obj.add("Hellooo");//6
		obj.add('M');//7
		System.out.println(obj.size());
		System.out.println(obj.get(4));
		obj.add(200);//8
		System.out.println(obj.size());//9
		obj.remove(8);
		System.out.println(obj.size());
		
		//System.out.println(obj.get(8));//array index out of bound
		
		//to print all the values of arraylist for loop
		for(int i=0;i<obj.size();i++) {
		System.out.println(obj.get(i));
	}
		//to restrict the type of data to go into arraylist
		
		ArrayList<Integer> obj1=new ArrayList<Integer>();
		obj1.add(20);
	//	obj.add("string") no allowed now 
		}

}
