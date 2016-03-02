import com.bimanywhere.CreateIssue;

public class MultiCreateIssues extends Thread {

	@Override
	public void run() {

		try {
			// TODO Auto-generated method stub
			CreateIssue createIssue = new CreateIssue();
			int count =0;
			for (int i = 0; i < 100; i++) {
				createIssue.newIssue();
				createIssue.exit();
				count ++;
				System.out.println(count+" done ! ---" + Thread.currentThread());
			}

		} catch (Exception e) {
			e.printStackTrace();
		} 

	};

	public static void main(String[] args)  {
		
		MultiCreateIssues th1 = new MultiCreateIssues(); 
		MultiCreateIssues th2 = new MultiCreateIssues(); 
		MultiCreateIssues th3 = new MultiCreateIssues(); 
		th1.start();
		th2.start();
		th3.start();
	}

}
