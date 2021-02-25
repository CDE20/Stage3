package singleton;

public class DBCon {
	
	private static DBCon instance=new DBCon();

	public static DBCon getInstance() {
		return instance;
	}

	private DBCon() {
	}

	public void show()
	{
		System.out.println("singleton example");
	}
}
