import java.awt.*;
import java.util.ArrayList;

public class ReverseString {

	public static void main(String[] args) {
		RandomString randomString = new RandomString();
		String str = randomString.randomStr();
		StringBuilder list= new StringBuilder();
		System.out.println("Before Reverse: "+str);
		for (int i = str.length()-1; i >=0 ; i--) {
			list.append(str.charAt(i));
		}
		System.out.println("After  Reverse: "+list.toString());
	}

}
