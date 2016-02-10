import java.util.*;

public class Test_ArrayList_sort {
	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<>();

		list.add("C");
		list.add("D");
		list.add("E");
		list.add("A");
		list.add("B");

		System.out.println("Before Sorting:");
		for (String counter : list) {
			System.out.println(counter);
		}

		Collections.sort(list);

		System.out.println("After Sorting:");
		for (String counter : list) {
			System.out.print(counter + " ");
		}
		System.out.println("");
		System.out.println("-------------Sorting in Descending order-----------------");
		// Collections.reverse(list);
		Collections.sort(list, Collections.reverseOrder());
		for (String counter : list) {
			System.out.print(counter + " ");
		}
		System.out.println("");

	}
}
