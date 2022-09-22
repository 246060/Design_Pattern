package facade.case1;

import facade.case1.facade.HelperFacade;
import facade.case1.subsystem.MySqlHelper;
import facade.case1.subsystem.OracleHelper;

import java.sql.Connection;

public class Client {

	public static void main(String[] args) {
		String tableName = "Employee";

		System.out.println("\nWithout using Facade\n");

		Connection con = MySqlHelper.getMySqlDBConnection();
		MySqlHelper mySqlHelper = new MySqlHelper();
		mySqlHelper.generateMySqlHTMLReport(tableName, con);

		Connection con1 = OracleHelper.getOracleDBConnection();
		OracleHelper oracleHelper = new OracleHelper();
		oracleHelper.generateOraclePDFReport(tableName, con1);

		System.out.println("-------------------------------------------");
		System.out.println("\nUsing Facade\n");

		HelperFacade.generateReport(HelperFacade.DBTypes.MYSQL, HelperFacade.ReportTypes.HTML, tableName);
		HelperFacade.generateReport(HelperFacade.DBTypes.ORACLE, HelperFacade.ReportTypes.PDF, tableName);
	}

}
