package abstractfactory;

public class AudiFactory extends Factory {

	@Override
	Headlight makeHeadlight() {
		Headlight audiheadlight=new AudiHeadlight();
		return audiheadlight;
	}

	@Override
	Tire makeTire() {
		Tire audiTire=new AudiTire();
		return audiTire;
	}

}
