package MYSQLPROJECT.FIRSTSQLCONNECTOR;
import java.sql.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class MySqlConnection1 {
	static final String DB_URL="jdbc:mysql://localhost:3306/student";
	static final String USER="root";
	static final String PASS="Password@12";
	static final String query="select * from stdtable";
	public static void main(String args[]) {
		try(Connection conn=DriverManager.getConnection(DB_URL,USER,PASS);
				Statement stmt=conn.createStatement();)
		{
			String sql="INSERT INTO STDTABLE VALUES(101,'JANU',5.1)";
			stmt.executeUpdate(sql);
			System.out.println("Inserted recorde into the table...");
			sql="INSERT INTO STDTABLE VALUES(102,'THARUN',5.5)";
			stmt.executeUpdate(sql);
			sql="INSERT INTO STDTABLE VALUES(103,'SAI',5.3)";
			stmt.executeUpdate(sql);
			ResultSet rs=stmt.executeQuery(query);
			while(rs.next()) {
				System.out.print("ID: "+rs.getInt("sid"));
				System.out.print(",Name: "+rs.getString("sname"));
				System.out.print(",height: "+rs.getFloat("height"));
				System.out.println();	
			}
			rs.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
	}
}
