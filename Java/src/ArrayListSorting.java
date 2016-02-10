import java.util.*;

public class ArrayListSorting {
	
	
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		ArrayList<Student> arrayList = new ArrayList<Student>();
		arrayList.add(new Student(1, "Jack", 14));
		arrayList.add(new Student(2, "Ben", 12));
		arrayList.add(new Student(3, "Tom", 15));
	
		Collections.sort(arrayList);
		
		for (Student student : arrayList) {
			System.out.println("Sort by student age: "+student);
		}
	}
}
