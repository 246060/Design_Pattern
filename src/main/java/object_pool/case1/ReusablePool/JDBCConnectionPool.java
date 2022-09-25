package object_pool.case1.ReusablePool;

import object_pool.case1.Reusable.MyConnection;

import java.sql.Connection;
import java.sql.SQLException;


public class JDBCConnectionPool extends ObjectPool<Connection> {

	private String dsn, usr, pwd;

	public JDBCConnectionPool(String driver, String dsn, String usr, String pwd) {
		super();

		try {
			// Class.forName(driver).newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}
		this.dsn = dsn;
		this.usr = usr;
		this.pwd = pwd;
	}

	@Override
	public Connection create() {
		try {
			// return DriverManager.getConnection(dsn, usr, pwd);
			return MyConnection.getConnection();
		} catch (SQLException e) {
			e.printStackTrace();
			return (null);
		}
	}

	@Override
	public boolean validate(Connection o) {
		try {
			return !(o.isClosed());
		} catch (SQLException e) {
			e.printStackTrace();
			return (false);
		}
	}

	@Override
	public void dead(Connection o) {
		try {
			o.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
