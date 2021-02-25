
public class App {

	public static void main(String[] args) {
		System.out.println(DBConn.getInstance().hashCode());
		System.out.println(DBConn.getInstance().hashCode());
	}

}
