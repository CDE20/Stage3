package dpdemo.finalAbstract;

public class OrderClient {

	public static void main(String[] args) {
		System.out.println(OrderFactory.buildOrder(ProductType.ELECTRONICPRODUCTS,Channel.ECOMMERCE)); 
        System.out.println(OrderFactory.buildOrder(ProductType.TOYS,Channel.ECOMMERCE)); 
        System.out.println(OrderFactory.buildOrder(ProductType.FURNITURE,Channel.TELECALLER)); 
        System.out.println(OrderFactory.buildOrder(ProductType.FURNITURE,Channel.ECOMMERCE));
	}

}
