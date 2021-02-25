package adapterPattern;

public class AdapterMain {

	public static void main(String[] args)
	{
		
		 MovableAdapter adapter=new MovableAdapterImpl();
		System.out.println( adapter.getSpeed());
		System.out.println( adapter.getPrice());
	}
	
}
