import com.atik.abstractclass.Factory;
import com.atik.abstractclass.Headlight;
import com.atik.abstractclass.Tire;
import com.atik.factory.AudiFactory;
import com.atik.factory.FactoryGetter;
import com.atik.factory.MercedesFactory;

public class Client {

	public static void main(String[] args) {
		Factory factory = FactoryGetter.getFactory(MercedesFactory.class);
		
		Headlight headlight = factory.makeHeadlight();
		Tire tire = factory.makeTire();
		System.out.println(headlight);
		System.out.println(tire);
		
		factory = FactoryGetter.getFactory(AudiFactory.class);
		headlight = factory.makeHeadlight();
		tire = factory.makeTire();
		System.out.println(headlight);
		System.out.println(tire);
	}
	
}
