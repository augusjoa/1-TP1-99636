package fiuba.algo3.tp1;
import org.junit.Assert;
import org.junit.Test;

public class ListaDePreciosTest {
	
	@Test
	public void testCrearPrecios() {
		ListaDePrecios precios = new ListaDePrecios();
		Assert.assertNotNull(precios);
	}
	
	
	@Test(expected=ValorNoEncontradoException.class)
	public void testPreciosNoObtenerProducto() {
		ListaDePrecios precios = new ListaDePrecios();
		Assert.assertNull(precios.getProducto("Auriculares"));
	}
	
	@Test
	public void testPreciosObteneProducto() {
		ListaDePrecios precios = new ListaDePrecios();
		Producto pan = new Producto("Pan", 50);
		precios.agregarProducto(pan);
		Assert.assertEquals(pan, precios.getProducto("Pan"));
	}
}
