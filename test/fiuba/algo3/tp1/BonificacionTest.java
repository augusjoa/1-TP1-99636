package fiuba.algo3.tp1;
import org.junit.Assert;
import org.junit.Test;

public class BonificacionTest {
	
	@Test
	public void testCrearBonificacion() {
		Bonificacion bonificacion = new Bonificacion(1000);
		Assert.assertNotNull(bonificacion);
	}

	@Test
	public void testNoCorrespondeBonificacion() {
		Bonificacion bonificacion = new Bonificacion(1000);
		Assert.assertFalse(bonificacion.correspondebonificacion(1100));
	}
	
	@Test(expected = ValorInvalidoException.class)
	public void testCrearBonficacionException(){
		new Bonificacion(-30);
	}
	
	@Test
	public void testCorrespondeBonificacion() {
		Bonificacion bonificacion = new Bonificacion(5000);
		Assert.assertTrue(bonificacion.correspondebonificacion(1100));
	}
}
