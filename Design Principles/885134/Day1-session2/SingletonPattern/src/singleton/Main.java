package singleton;

public class Main {

	public static void main(String[] args) {
		DBCon con=DBCon.getInstance();
		con.show();
	}

}
