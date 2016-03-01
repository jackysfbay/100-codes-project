import com.bimanywhere.CreateIssue;

public class MultiCreateIssues {

	public static void main(String[] args) throws InterruptedException {
		
		
		try{
		// TODO Auto-generated method stub
		CreateIssue createIssue = new CreateIssue();
		
		for (int i = 0; i < 10; i++) {
			createIssue.newIssue();
			createIssue.exit();
		
		}
		
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			System.out.println("done !");
		}
	}

}
