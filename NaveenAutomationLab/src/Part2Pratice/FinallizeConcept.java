package Part2Pratice;
//finalize is a method
public class FinallizeConcept {

	
	public void finalize()
	{
		System.out.println("finalized method");
	}
	public static void main(String[] args) {
		FinallizeConcept obj1=new FinallizeConcept();
		FinallizeConcept obj2=new FinallizeConcept();
		
		obj1=null;//there is object but no reference 
		obj2=null;//so these objects will be destroyed by garbage collectors
		
		System.gc();//it calls garbage collectors
		
	}

}
