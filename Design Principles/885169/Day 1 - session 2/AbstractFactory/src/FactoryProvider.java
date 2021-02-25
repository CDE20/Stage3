
public class FactoryProvider{
	public static Factory getFactory(boolean audi)
	{
		if(audi)
		{
			return new AudiFactory();
		}else {
			return new MercedesFactory();
		}
	}

	
	}

