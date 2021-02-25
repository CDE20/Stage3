
public class MercedesFactory extends Factory {

	public Headlight makeHeadlight() {
		return new MercedesHeadlight();
	}

	public Tire makeTire() {
		return new MercedesTire();
	}

}
