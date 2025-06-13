package jdbc;
import java.sql.*;
public class JdbcDemo {
	public static void main(String[]args) throws SQLException {
		String url="jdbc:mysql://localhost:3306/jdbc";
		String uname="root";
		String pass="";
		Connection con =DriverManager.getConnection(url,uname,pass);
		String query="select * from students";
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(query);
		//System.out.println(rs.next());
		while(rs.next()) {
			int Sno=rs.getInt("sno");
			String Name=rs.getString("name");
			String Email=rs.getString("email");
			int Mobile=rs.getInt("mobile");
			System.out.println(Sno+" "+Name+" "+Email+" "+Mobile);
		}
		con.close();
		rs.close();
		
	}

}
