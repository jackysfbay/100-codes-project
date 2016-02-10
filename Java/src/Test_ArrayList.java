import java.util.*;

public class Test_ArrayList {
	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("E");
		
		System.out.println(list);
		
		list.remove(list.size()-1);
//		System.out.println(list);
//		System.out.println(list.indexOf("A"));
//		String string = list.get(2);
//		System.out.println(string);
//		
		list.add(0, "1");
//		System.out.println(list);
										
		ArrayList<String> list2 = 
				new ArrayList<String>(Collections.nCopies(2, "N")); //nCopies(count, element)
//		System.out.println(list2);
		
		
		System.out.println("-----------------------For loop -----------------------------------------");
		// For loop 
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i)+", ");
		}
		System.out.println("---------------------Advanced Loop-------------------------------------------");
		//Advanced For Loop
		for (String str : list) {
			System.out.println( str+", ");		
			}
		System.out.println("---------------------While Loop-------------------------------------------");
		int count = 0;
		while (list.size() > count) {
			System.out.println(list.get(count));
			count++;
		}
		System.out.println("---------------------Looping Array List using Iterator-------------------------------------------");
		Iterator iterator = list.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
			
		}
		System.out.println("---------------------Enumerate through the ArrayList elements------------------------------------------");
			Enumeration<String> e = Collections.enumeration(list);
			while (e.hasMoreElements()) {
				String string = (String) e.nextElement();
				System.out.println(string);
			}
	}
}
