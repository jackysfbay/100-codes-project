
public class Test04 {

	public static int add(int n, int... args) {

		int sum = n;
		System.out.println("arge size: "+args.length);
		System.out.println("Tostirng: "+args.toString());
		for (int i = 0; i < args.length; i++) {
			sum += args[i];
		}

		return sum;

	}
	public static void main(String[] args) {
		System.out.println(add(2,0,0,0,0,0,0));
	}
}
