package jdbc;
import java.sql.*;
import java.util.*;
public class JdbcDemo1 {

	public static void main(String[] args) throws SQLException {
		Scanner sc=new Scanner(System.in);
		String url="jdbc:mysql://localhost:3306/jdbc";
		String uname="root";
		String pass="";
		Connection con =DriverManager.getConnection(url,uname,pass);
		Statement st=con.createStatement();
		String query="INSERT INTO `students` (`name`, `email`, `mobile`) VALUES ('ballaribro', 'balari@gmail.com', 23893888)";
		int rs= st.executeUpdate(query);
		System.out.println(rs + " rows affected");
	}

}
