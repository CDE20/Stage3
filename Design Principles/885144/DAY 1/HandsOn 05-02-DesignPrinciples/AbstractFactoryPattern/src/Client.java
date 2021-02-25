
public class Client {

	public static void main(String[] args) {
		
		//For Audi 
		Factory audiFactory = FactoryGetter.getFactory("Audi");
		Tire audiTire = audiFactory.makeTire();
		Headlight audiHeadlight = audiFactory.makeHeadlight();
		if (audiTire instanceof AudiTire && audiHeadlight instanceof AudiHeadlight) {
			System.out.println("Tire and Headlight belongs to AUDI.");
		}
		
		//For Mercedes
		Factory mercedesFactory = FactoryGetter.getFactory("Mercedes");
		Tire mercedesTire = mercedesFactory.makeTire();
		Headlight mercedesHeadlight = mercedesFactory.makeHeadlight();
		if (mercedesTire instanceof MercedesTire && mercedesHeadlight instanceof MercedesHeadlight) {
			System.out.println("Tire and Headlight belongs to MERCEDES.");
		}
	}
}
