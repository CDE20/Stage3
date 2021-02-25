package singletonHandson;

public class DBConn {
	
	private static DBConn instance;
	
	 public  DBConn()
	{}
		
	 public  static synchronized DBConn getInstance() {
	    System.out.println("inside getInstace method");
	    if(instance==null)
	    {
	    	instance =new DBConn();
	    }
		// count++;
		// System.out.println(count);
		return instance;
	}
}
