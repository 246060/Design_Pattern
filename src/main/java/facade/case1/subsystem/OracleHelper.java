package facade.case1.subsystem;

import java.sql.Connection;

public class OracleHelper {

	public static Connection getOracleDBConnection() {
		//get Oracle DB connection using connection parameters
		System.out.println("get Oracle Connection");
		return null;
	}

	public void generateOraclePDFReport(String tableName, Connection con) {
		//get data from table and generate pdf report
		System.out.println("generate Oracle PDF Report");
	}

	public void generateOracleHTMLReport(String tableName, Connection con) {
		//get data from table and generate pdf report
		System.out.println("generate Oracle HTML Report");
	}
}
