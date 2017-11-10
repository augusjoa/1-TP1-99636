package fiuba.algo3.tp1;

import org.junit.Assert;
import org.junit.Test;

public class CuponeraTest {
	
	private static final double DELTA = 1e-15;
	
	@Test
	public void testCrearCuponera() {
		Cuponera cuponera = new Cuponera();
		Assert.assertNotNull(cuponera);
	}
	
	@Test
	public void testCuponeraEstaVacio() {
		Cuponera cuponera = new Cuponera();
		Assert.assertTrue(cuponera.estavacio());
	}
	
	@Test
	public void testagregarCuponyCuponeraNoEstaVacia() {
		Cuponera cuponera = new Cuponera();
		Cupon cupon = new Cupon(30);
		cuponera.agregarCupon(cupon);
		Assert.assertTrue(!cuponera.estavacio());
	}
	
	@Test
	public void testAplicarDescuento() {
		Cuponera cuponera = new Cuponera();
		Cupon cupon = new Cupon(30);
		cuponera.agregarCupon(cupon);
		Assert.assertEquals(70, cuponera.aplicarDescuento(100), DELTA);
	}
	
	@Test
	public void testAplicarDescuentoConMasDeUnCupon() {
		Cuponera cuponera = new Cuponera();
		Cupon cupon = new Cupon(30);
		Cupon cupon2 = new Cupon(40);
		cuponera.agregarCupon(cupon2);
		cuponera.agregarCupon(cupon);
		Assert.assertEquals(60, cuponera.aplicarDescuento(100), DELTA);
	}
}
