public class Main {

	public static void main(String[] args) {
		System.out.println(Factory.order(ProductType.ELECTRONIC,Channel.ECOMMERCE));
		System.out.println(Factory.order(ProductType.FURNITURE,Channel.ECOMMERCE));
		System.out.println(Factory.order(ProductType.TOY,Channel.ECOMMERCE));
		System.out.println(Factory.order(ProductType.ELECTRONIC,Channel.TELECALLER));
		System.out.println(Factory.order(ProductType.FURNITURE,Channel.TELECALLER));
		System.out.println(Factory.order(ProductType.TOY,Channel.TELECALLER));
		
	}
}