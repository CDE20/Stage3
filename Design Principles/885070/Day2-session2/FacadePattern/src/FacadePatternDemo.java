import java.util.Scanner;

public class FacadePatternDemo {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter shape u want to create - circle/rectangle/square");
		String choice;
		choice=sc.nextLine();
		ShapeMaker maker=new ShapeMaker();
		switch(choice)
		{
			case "circle" :
				maker.drawCircle();
				break;
			case "rectangle" :
				maker.drwaRectangle();
				break;
			case "square" :
				maker.drawSquare();
				break;
			default :
				System.out.println("Invalid choice");
		}
		
	}

}