package fiuba.algo3.tp1;

import org.junit.Assert;
import org.junit.Test;

public class CuponTest {
	private static final double DELTA = 1e-15;
	
	@Test 
	public void testCrearDescuento() {
		Cupon unCupon = new Cupon(5);
		Assert.assertNotNull(unCupon);
	}
	
	@Test(expected = ValorInvalidoException.class)
	public void testCrearDescuentoNegativoException() {
		new Cupon(-25);
	}
	
	@Test(expected = ValorInvalidoException.class)
	public void testCrearDescuentoMayorDeCienException() {
		new Cupon(2048);
	}
	
	@Test
	public void testAplicarDescuento() {
		Cupon unCupon = new Cupon(50);
		Assert.assertEquals(1000, unCupon.aplicarDescuento(2000), DELTA);
	}
	
	@Test
	public void testAplicarDescuento2() {
		Cupon unCupon = new Cupon(25);
		Assert.assertEquals(3750, unCupon.aplicarDescuento(5000), DELTA);
	}

}
