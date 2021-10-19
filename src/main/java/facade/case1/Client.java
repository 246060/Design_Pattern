package facade.case1;

import static practice_1.facade.case1.HelperFacade.DBTypes.*;
import static practice_1.facade.case1.HelperFacade.ReportTypes.*;

public class Client {
    public static void main(String[] args) {

        final String tableName = "Employee";

        //generating MySql HTML report and Oracle PDF report without using Facade
        new MySqlHelper().generateMySqlHTMLReport(tableName, MySqlHelper.getMySqlDBConnection());
        new OracleHelper().generateOraclePDFReport(tableName, OracleHelper.getOracleDBConnection());

        //generating MySql HTML report and Oracle PDF report using Facade
        HelperFacade.generateReport(MYSQL, HTML, tableName);
        HelperFacade.generateReport(ORACLE, PDF, tableName);
    }
}
