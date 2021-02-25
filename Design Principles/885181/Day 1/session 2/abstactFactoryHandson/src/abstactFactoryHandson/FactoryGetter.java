package abstactFactoryHandson;

public class FactoryGetter {
	public static Factory getFactory(String choice){  
	      if(choice.equalsIgnoreCase("audi")){  
	         return new AudiFactory();  
	      } else if(choice.equalsIgnoreCase("mercedes")){  
	         return new MercedesFactory();  
	      }  
	      return null;  
 }
}
