
public class main {

	public static void main(String[] args) {
		
		DBConn conn = DBConn.getInstance();
		
		if(conn instanceof DBConn){
			System.out.println("SingleTon Implemented");
		}
	}

}
