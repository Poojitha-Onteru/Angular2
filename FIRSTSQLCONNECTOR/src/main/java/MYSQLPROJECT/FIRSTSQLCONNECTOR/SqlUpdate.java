package MYSQLPROJECT.FIRSTSQLCONNECTOR;
import java.sql.*;
public class SqlUpdate {
	static final String DB_URL="jdbc:mysql://localhost:3306/student";
	static final String USER="root";
	static final String PASS="Password@12";
	static final String query="select * from stdtable";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(Connection conn=DriverManager.getConnection(DB_URL,USER,PASS);
				Statement stmt=conn.createStatement()){
			String sql="UPDATE stdtable "+"set height=5.7 where sid=103";
			stmt.executeUpdate(sql);
			ResultSet res=stmt.executeQuery(query);
			while(res.next()) {
				System.out.print("ID: "+res.getInt("sid"));
				System.out.print(",Name: "+res.getString("sname"));
				System.out.print(",height: "+res.getFloat("height"));
				System.out.println();
			}
			res.close();
		}catch(SQLException e) {
			System.out.println(e);
		}
	}
}