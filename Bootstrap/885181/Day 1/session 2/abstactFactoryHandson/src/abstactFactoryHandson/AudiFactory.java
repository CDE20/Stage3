package abstactFactoryHandson;

public class AudiFactory extends Factory {

	@Override
	public Tire getBank(String tire) {
		// TODO Auto-generated method stub
		if(tire==null)
			return null;
		if(tire=="audi")
		{
			return new AudiTire();
		}
		return null;
	}

	@Override
	public Headlight getLoan(String headlight) {
		// TODO Auto-generated method stub
		if(headlight==null)
			return null;
		if(headlight=="audi")
		{
			return new AudiHeadlight();
		}
		return null;
	}

}
