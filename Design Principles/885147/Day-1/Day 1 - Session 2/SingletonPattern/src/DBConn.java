
public class DBConn {

	private static DBConn instance = new DBConn();

	private DBConn() {

	}

	static DBConn getInstance() {
		return instance;
	}

}