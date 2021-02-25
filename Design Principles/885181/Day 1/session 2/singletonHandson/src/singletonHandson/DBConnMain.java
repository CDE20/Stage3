package singletonHandson;

public class DBConnMain {
  public static void main(String[] args)
  {
	  
	//  DBConn ddobj=new DBConn();
	   
	     DBConn dbobj1=DBConn.getInstance();
	     System.out.println(dbobj1);
	     DBConn dbobj2=DBConn.getInstance();
	     System.out.println(dbobj1);
  }
}
