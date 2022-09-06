//Java Database Connectivity theory

/*
 *import package----- java.sql
 *load and register the driver
 *Create Connection
 *Create a statement
 *execute the query
 *process the result
 *close
 */
import java.sql.*;

public class Mysql_connect {
	
	public static void main(String[] args) throws Exception
	{
		String url = "jdbc:mysql://localhost:3306/information";
		String uname = "root";
		String pass = "HAIDAR@a123";
		String query = "Select name from studentdata where roll=161361031021";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url,uname,pass);
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);
		rs.next();
		String name = rs.getString("name");
		
		
		System.out.println(name);
		st.close();
		con.close();
	}

}
