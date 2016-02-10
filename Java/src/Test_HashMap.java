import java.util.*;

public class Test_HashMap {

	public static void main(String[] args) {

		HashMap<Integer, String> hMap = new HashMap<Integer, String>();
		hMap.put(1, "Ben");
		hMap.put(2, "Jon");
		hMap.put(7, "Singh");
		hMap.put(49, "Ajeet");
		hMap.put(3, "Anuj");
		
	      /* Display content using Iterator*/
		Set set = hMap.entrySet();
		Iterator iter = set.iterator();
		while (iter.hasNext()) {
			Map.Entry entry = (Map.Entry) iter.next();
			System.out.print("Key is: " + entry.getKey() + "   Value is: ");
			System.out.println(entry.getValue());
		}
	
		System.out.println(hMap.containsKey(2));
		System.out.println(hMap.containsValue("Ben"));
	}
}
