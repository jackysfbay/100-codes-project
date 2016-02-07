import java.util.*;

public class ArrayList_VS_LinkedList {
	static final int N = 50000;

	static long timeList(List list) {
		long start = System.currentTimeMillis();
		Object obj = new Object();
		for (int i = 0; i < N; i++)

			// The method add(int, Object) belongs to the raw type List.
			// References to generic type List<E> should be parameterized
			list.add(0, obj);
		return System.currentTimeMillis() - start;
	}

	public static void main(String[] args) {
		System.out.println("ArrayList time cost：" + timeList(new ArrayList()));
		System.out.println("LinkedList time cost：" + timeList(new LinkedList()));

	}

}
