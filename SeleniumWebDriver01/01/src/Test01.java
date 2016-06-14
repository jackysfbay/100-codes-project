import java.util.ArrayList;

public class Test01 {

	public static void main(String[] args) {

		String str = "I Love Java";

		String[] list = str.split(" ");

		ArrayList<String> list2 = new ArrayList<String>();
		int len = list.length;
		for (int i = len - 1; i >= 0; i--) {
			list2.add(new StringBuffer(list[i]).reverse().toString());
		}

		System.out.println(list2);
	}
}
