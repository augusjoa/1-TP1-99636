package fiuba.algo3.tp1;

import org.junit.Assert;
import org.junit.Test;

public class GarantiaTest {
	private static final double DELTA = 1e-15;
	
	@Test
	public void testCrearGarantia() {
		Garantia garantia = new Garantia(0.10);
		Assert.assertNotNull(garantia);
	}
	
	@Test(expected = ValorInvalidoException.class)
	public void testCrearGarantiaException() {
		new Garantia(-1);
	}
	
	@Test
	public void testCalcularGarantia() {
		Garantia garantia = new Garantia(0.10);
		Assert.assertEquals(1100, garantia.calcularGarantia(1000), DELTA);
	}

}
