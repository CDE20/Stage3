
public class DBConn {
	
	//Create a DBConn class with a static private member – ‘instance’ to hold its own instance.
	//Create a new instance of the object and assign it to the instance variable.
	private static DBConn instance=new DBConn();
	
	//Make the constructor of the class as private
	 private DBConn()
	{
		
	}
	
	//Implement a ‘getInstance()’ static method to return the instance variable.
	public static DBConn getInstance()
	{
		return instance;
	}
	
	//Implement a caller method to call this method to get the instance
	public void caller()
	{
		//System.out.println("In caller Method");
		System.out.println(getInstance());
		
	}
	
	

}
