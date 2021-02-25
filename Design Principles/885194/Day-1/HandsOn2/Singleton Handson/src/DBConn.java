
public class DBConn {
	
	private static DBConn instance=new DBConn();
	
	private DBConn() {
		
	}
	
	public static DBConn getInstance()
	{
		return instance;
	}
	
	/*
	 * This is done to retrieve same insatance(i.e. same hashcode) of the class,irrespective of requests
	 * */
}
