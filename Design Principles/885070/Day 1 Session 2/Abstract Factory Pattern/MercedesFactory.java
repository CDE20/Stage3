package abstractfactoryhandson;

public class MercedesFactory extends Factory {

	@Override
	public Headlight makeHeadLight() {
		// TODO Auto-generated method stub
		return new MercedesHeadLight();
	}

	@Override
	public Tire makeTire() {
		// TODO Auto-generated method stub
		return new MercedesTire();
	}

}
