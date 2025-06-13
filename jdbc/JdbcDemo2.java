package jdbc;
import java.util.*;
import java.sql.*;
public class JdbcDemo2 {
	public static void main(String[]args) throws SQLException {
		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter Sno: ");
//		int Sno=sc.nextInt();
		System.out.println("Enter Name: ");
		String Name=sc.next();
		System.out.println("Enter Email id: ");
		String Email=sc.next();
		System.out.println("Enter Mobile No: ");
		int Mobile=sc.nextInt();
		String url="jdbc:mysql://localhost:3306/jdbc";
		String uname="root";
		String pass="";
		Connection con =DriverManager.getConnection(url,uname,pass);
		String query="INSERT INTO `students` (`name`, `email`, `mobile`) VALUES (?,?,?)";
		PreparedStatement ps=con.prepareStatement(query);
		ps.setString(1, Name);
		ps.setString(2,Email);
		ps.setInt(3, Mobile);
		
		if(ps.executeUpdate()>0) {
			System.out.println("1 row is inserted");
			
		}else {
			System.out.println("something is wrong");
		}

	
	}

}
