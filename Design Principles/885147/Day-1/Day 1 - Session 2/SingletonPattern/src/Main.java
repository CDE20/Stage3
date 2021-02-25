public class Main {

	public static void main(String[] args) {

		DBConn instance = DBConn.getInstance();

		if (instance instanceof DBConn) {
			System.out.println("SingleTon Pattern Implemented Successfully");
		}
	}

}