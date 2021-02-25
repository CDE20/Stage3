
public class AudiFactory extends Factory {

	public Headlight makeHeadlight() {
		return new AudiHeadlight();
	}

	public Tire makeTire() {
		return new AudiTire();
	}

}
