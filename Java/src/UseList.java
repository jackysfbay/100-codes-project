import java.util.*;

public class UseList {
	public static void main(String[] args) {
		List<String> l1 = new LinkedList<String>();
		for (int i = 0; i <= 5; i++) {
			l1.add("a" + i);
		}

		System.out.println(l1);
		l1.add(3, "a100");
		System.out.println(l1);
		l1.set(6, "a200");
		System.out.println(l1);
		System.out.print((String) l1.get(2) + " ");
		System.out.println(l1.indexOf("a3"));

		l1.remove(1);
		System.out.println(l1);

		List<String> list1 = new LinkedList<String>();
		List<String> list2 = new LinkedList<String>();
		for (int i = 0; i <= 9; i++) {
			list1.add("a" + i);
		}
		System.out.println(list1);

		Collections.shuffle(list1);
		System.out.println(list1);

		Collections.reverse(list1);
		System.out.println(list1);

		Collections.sort(list1);
		System.out.println(list1);

		System.out.println(Collections.binarySearch(list1, "a5"));

	}
}
