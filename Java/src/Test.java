import java.sql.*;

public class Test {

	public static void query() throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		String URL = "jdbc:mysql://127.0.0.1:3301/student";
		String USER = "root";
		String PASSWORD = "";
		String sql = "select * from info";
		Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);

		Statement stm = conn.createStatement();
		ResultSet rSet = stm.executeQuery(sql);

		while (rSet.next()) {
			System.out.println(rSet.getString("name"));
		}

	}

	public static void main(String[] args) throws Exception {
		query();
	}

}
