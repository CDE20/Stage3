package abstractfactory;

public class MercedesFactory extends Factory{

	@Override
	Headlight makeHeadlight() {
		Headlight headlight=new MercedesHeadlight();
		return headlight;
	}

	@Override
	Tire makeTire() {
		Tire tire=new MercedesTire();
		return tire;
	}

}
