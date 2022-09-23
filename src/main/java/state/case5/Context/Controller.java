package state.case5.Context;

import state.case5.AbstractState.Connection;
import state.case5.ConcreteState.Accounting;
import state.case5.ConcreteState.Management;
import state.case5.ConcreteState.Sales;

public class Controller {

	public static Accounting acct;
	public static Sales sales;
	public static Management management;

	private static Connection con;

	public Controller() {
		acct = new Accounting();
		sales = new Sales();
		management = new Management();
	}

	public void setAccountingConnection() {
		con = acct;
	}

	public void setSalesConnection() {
		con = sales;
	}

	public void setManagementConnection() {
		con = management;
	}

	public void open() {
		con.open();
	}

	public void close() {
		con.close();
	}

	public void log() {
		con.log();
	}

	public void update() {
		con.update();
	}
}
