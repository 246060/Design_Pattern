package facade.case1;

import static facade.case1.HelperFacade.DBTypes.MYSQL;
import static facade.case1.HelperFacade.DBTypes.ORACLE;
import static facade.case1.HelperFacade.ReportTypes.HTML;
import static facade.case1.HelperFacade.ReportTypes.PDF;

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
