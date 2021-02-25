import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestConverter {

	@Test
	void testConvertedValueOfUSDtoEuro() {
		Currency usd = new USDollar();
		CurrencyAdapter usdAdapter = new CurrencyAdapterImpl(usd);
		assertEquals(usdAdapter.getPrice(),41.0,.01);
	}

}
