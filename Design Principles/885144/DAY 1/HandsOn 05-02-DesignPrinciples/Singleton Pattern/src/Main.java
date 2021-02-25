
public class Main {

	public static void main(String[] args) {

		DBConn con1 = DBConn.getInstance();
		System.out.println("Instance 1: " + con1.toString());

		DBConn con2 = DBConn.getInstance();
		System.out.println("Instance 2: " + con2.toString());

		if (con1 == con2) {
			System.out.println("Got same instance.");
		} else {
			System.out.println("Not Same.");
		}
	}

}
