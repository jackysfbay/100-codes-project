import java.util.ArrayList;

public class Test01 {

	public void arr(){
		
		ArrayList<Integer> list =  new ArrayList<Integer>();
		
		for(int i= 0 ; i<100000; i++){
			int random = (int) (Math.random()*10);
			list.add(random);
		}
		
		System.out.println(list); 
	}
	
}
