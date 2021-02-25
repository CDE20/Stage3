
public class CurrencyAdapterImpl implements CurrencyAdapter {

	private Currency currency;
	
	public CurrencyAdapterImpl(Currency c) {
		// TODO Auto-generated constructor stub
		this.currency = c;
	}
	
	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return convertUSDtoEuro(currency.getPrice());
	}
	
	private double convertUSDtoEuro(double priceInUSD) {
		return 0.82 * priceInUSD;
	}

}
