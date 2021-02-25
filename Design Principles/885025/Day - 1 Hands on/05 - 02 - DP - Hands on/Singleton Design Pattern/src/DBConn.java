
public class DBConn {

	private static DBConn instance=new DBConn();
	
	private DBConn() {
	}
	
	public static DBConn getInstance() {
		return instance;
	}
	
	public void print() {
		System.out.println("Got the instance");
	}
}
