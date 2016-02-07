import java.util.Random;

public class RandomString {

	public static String randomStr() {

		String temp = "abcdefghijklmnopqrstuvwxyz";//ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789
		Random random = new Random();
		StringBuilder str = new StringBuilder();

		for (int i = 0; i < 6; i++) {
			int num = random.nextInt(temp.length());// generate a num within
			str.append(temp.charAt(num));
		}
		return str.toString();
	}

	public static void main(String[] args) {
		for (int i = 0; i < 100; i++) {
			System.out.println(randomStr());
		}
	}

}
