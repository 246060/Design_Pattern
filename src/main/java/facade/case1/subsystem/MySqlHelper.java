package facade.case1.subsystem;

import java.sql.Connection;

public class MySqlHelper {

	public static Connection getMySqlDBConnection() {
		//get MySql DB connection using connection parameters
		System.out.println("get MySql Connection");
		return null;
	}

	public void generateMySqlPDFReport(String tableName, Connection con) {
		//get data from table and generate pdf report
		System.out.println("generate MySql PDF Report");
	}

	public void generateMySqlHTMLReport(String tableName, Connection con) {
		//get data from table and generate pdf report
		System.out.println("generate MySql HTML Report");
	}
}
