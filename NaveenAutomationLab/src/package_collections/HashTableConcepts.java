package package_collections;
//hash table no indexing we have key and value
import java.util.Hashtable;
public class HashTableConcepts {

	public static void main(String[] args) {
		Hashtable ht=new Hashtable();
		ht.put("S", "Strong");
		ht.put("H", "High");
		ht.put("R", "Rosy");
		ht.put("I", "Innovative");
		System.out.println(ht.size());
		
		ht.put(1, "naughty");//allowed
		ht.put(1,200);//allowed
		System.out.println(ht.size());
		System.out.println(ht.get("S"));
		System.out.println(ht.get(1));
		
		
	}

}
