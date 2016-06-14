import java.util.ArrayList;

public class Test0001 {

	public static void main(String[] args) {

		int[] list = new int[] { 1, 2, 3, 4, 5, 2, 3, 4, 5, 6 };
//		m1(list);
		m2(list);

	}

	public static void m1(int[] list) {

		ArrayList num = new ArrayList();
		for (int i = 0; i < list.length; i++) {

			if (!num.contains(list[i])) {
				num.add(list[i]);
			}
		}
		System.out.println(num);
	}
	
	
	public static void m2(int[] list){
		
		for (int i = 0; i < list.length; i++) {
				
				int count =0;
				
				for (int j = 0; j < list.length; j++) {
					
					
					
				}
		}
	}
}
