package jdbc_assignment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC {

	public static void main(String[] args) {

		Connection connection = null;
		try {
			Class.forName("org.postgresql.Driver");
			System.out.println("Driver loaded successfully");
			
			// Open Connection
			String url = "jdbc:postgresql://localhost:5432/postgres";
			String username = "postgres";
			String password = "admin";
			connection = DriverManager.getConnection(url, username, password);
			System.out.println("Connection opened");
			
			// Create Statement
			Statement statement = connection.createStatement();
			String sql = "select p.id, p.name, p.city, p.gender, p.age, t.teamname, t.location "
					+ "from player_schema.player p join player_schema.team t on p.teamid =t.teamid "
					+ "where city='Chennai' order by id asc;";
			
			//Execute Query
			ResultSet resultSet = statement.executeQuery(sql);
			System.out.println("Query executed");
			
			//Process Results
			while(resultSet.next()) {
				System.out.print(" Id : "+resultSet.getInt("id"));
				System.out.print(" Name : "+resultSet.getString("name"));
				System.out.print(" City : "+resultSet.getString("city"));
				System.out.print(" Gender : "+resultSet.getString("gender"));
				System.out.print(" Age : "+resultSet.getInt("age"));
				System.out.print(" TeamName : "+resultSet.getString("teamname"));
				System.out.println(" Team Location : "+resultSet.getString("location"));
			}			
			System.out.println("Results processed successfully");
			
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		} catch (SQLException e) {
			System.out.println(e);
		} finally {
			try {
				// Release connection
				connection.close();
				System.out.println("Connection closed");
			} catch (SQLException e) {
				System.out.println(e);
			}
		}
	}
}