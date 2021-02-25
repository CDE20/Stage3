package abstactFactoryHandson;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class AbstractFactoryMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Factory audifactory = FactoryGetter.getFactory("Audi");  
		//Bank b=bankFactory.getBank(bankName);  
		 
		Factory mercedesfactory = FactoryGetter.getFactory("Mercedes");  
		

	}

}
