
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Factory f1=FactoryProvider.getFactory(true);
		Headlight h=f1.makeHeadlight();
		h.print();
		Tire t=f1.makeTire();
		t.print();
		
		Factory f2=FactoryProvider.getFactory(false);
		Headlight h1=f2.makeHeadlight();
		h1.print();
		Tire t1=f2.makeTire();
		t1.print();
		

	}

}
