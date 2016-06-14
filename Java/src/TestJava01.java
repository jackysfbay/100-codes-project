import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.GregorianCalendar;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TestJava01 implements F{
	
	public TestJava01(){
		System.out.println("TestJava01");
	}
	
	public TestJava01(String str){
		System.out.println(str);
	}

	public static void main(String[] args) {
//
//		int[] list ={1,2,3};
//		try {
//			System.out.println(list[5]);
//			
//		} catch (Exception e) {
//			e.printStackTrace(System.err);
//		}
		TestJava01 t = new TestJava01();
		new TestJava01("sd888d");

		t.pit();
		System.out.println(t.pit2(4));
	
		
	}

	@Override
	public void pit() {
	 System.out.println(PI);
		
	}

	@Override
	public int pit2(int i) {
		
		return i;
	}
}

 interface F{
	public static final double PI=3.14;
	
	public abstract void pit();
	public abstract int pit2(int i);
	
	
	
}
 
 
 class T{
	 
	 public static void main(String[] args) {
		
	List<String> list = new ArrayList<String>();
	list.add("a");
	list.add("b");
	list.add("b");
	list.add("c");
	
	Set<String> set =  new HashSet<String>();
	set.addAll(list);
	System.out.println(list);
	System.out.println(set);
		 
	 }
	 
 }



