package fiuba.algo3.tp1;

import org.junit.Assert;
import org.junit.Test;

public class ProductoTest {
	private static final double DELTA = 1e-15;
	
	@Test
	public void testCrearProducto() {
		Producto producto = new Producto("MP3", 500);
		Assert.assertNotNull(producto);
	}
	
	@Test (expected = ValorInvalidoException.class)
	public void testCrearProductoException() {
		new Producto("MP3", -800);
	}
	
	@Test
	public void testObtenerPrecio() {
		Producto producto = new Producto("MP3", 500);
		Assert.assertEquals(500, producto.getPrecio(), DELTA);
		
	}
	
	@Test
	public void testObtenerNombre() {
		Producto producto = new Producto("MP3", 500);
		Assert.assertEquals("MP3", producto.getNombre());
	}

}
