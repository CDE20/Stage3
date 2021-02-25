
public class DBConn {
	
	private static DBConn dBConn = new DBConn();
	
	private DBConn() {
		
	}
	
	public static DBConn getInstance() {
		return dBConn;
	}
	
}
