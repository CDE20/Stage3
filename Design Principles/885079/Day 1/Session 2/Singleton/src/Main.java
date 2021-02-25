public class Main {

	public static void main(String[] args) {

		DBConn dbConn = DBConn.getInstance();
		System.out.println(dbConn.hashCode());
		DBConn dbConn1 = DBConn.getInstance();
		System.out.println(dbConn1.hashCode());
	}
}
