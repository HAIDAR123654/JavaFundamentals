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

public class Mysql_connect2 {
	
	public static void main(String[] args) throws Exception
	{
		String url = "jdbc:mysql://localhost:3306/information";
		String uname = "root";
		String pass = "HAIDAR@a123";
		String query = "Select * from studentdata";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url,uname,pass);
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);
		
		while(rs.next())
		{
		
		
		String whole_table = rs.getString(1)+ " --- "+ rs.getString(2)+ " --- "+
		                     rs.getString(3)+ " --- "+ rs.getString(4)+ " --- "+
		                     rs.getString(5)+ " --- "+ rs.getString(6)+ " --- "+
		                     rs.getString(7);
		
		
		System.out.println(whole_table);
		
		}
		st.close();
		con.close();
	}

}
