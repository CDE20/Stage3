
public class FactoryGetter {

	public static Factory getFactory(String company) {
		if (company.equalsIgnoreCase("Audi")) {
			return new AudiFactory();
		} else if (company.equalsIgnoreCase("Mercedes")) {
			return new MercedesFactory();
		}
		return null;
	}

}
