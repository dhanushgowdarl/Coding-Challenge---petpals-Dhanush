package util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnUtil {

	public static void main(String[] args) throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/petpal", "root", "Dhanu@9606");

		System.out.println("Connection established");
	}
}