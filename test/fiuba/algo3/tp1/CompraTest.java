package fiuba.algo3.tp1;

import org.junit.Assert;
import org.junit.Test;

public class CompraTest {
	private static final double DELTA = 1e-15;
	
	@Test
	public void testCrearCompra(){
		Compra compra = new Compra();
		Assert.assertNotNull(compra);
	}
	
	@Test
	public void testCrearCompraConEnvio(){
		Compra compra = new Compra();
		compra.agregarEnvio(100, 0);
		Assert.assertNotNull(compra);
	}
	
	@Test
	public void testCrearCompraConGarantia(){
		Compra compra = new Compra();
		compra.agregarGarantia(0.10);
		Assert.assertNotNull(compra);
	}
	
	@Test
	public void testCrearCompraConEnvioyGarantia(){
		Compra compra = new Compra();
		compra.agregarEnvioYGarantia(100, 0, 0.10);
		Assert.assertNotNull(compra);
	}
	
	@Test
	public void testCompraAgregarProductoyCalcularPrecio() {
		Compra compra = new Compra();
		Producto producto = new Producto("MotoG", 1000);
		compra.agregarProductoEnCompra(producto);
		Assert.assertEquals(1000, compra.calcularPrecio(), DELTA);
	}
	
	@Test
	public void testCompraAgregarProductosyCalcularPrecio() {
		Compra compra = new Compra();
		Producto producto = new Producto("MotoG", 1000);
		Producto producto2 = new Producto("Auriculares", 500);
		compra.agregarProductoEnCompra(producto);
		compra.agregarProductoEnCompra(producto2);
		Assert.assertEquals(1500, compra.calcularPrecio(), DELTA);
	}
	
	@Test
	public void testCompraconEnvioSinBonificacionAgregarProductosyCalcularPrecio() {
		Compra compra = new Compra();
		Producto producto = new Producto("MotoG", 1000);
		Producto producto2 = new Producto("Auriculares", 500);
		compra.agregarProductoEnCompra(producto);
		compra.agregarProductoEnCompra(producto2);
		compra.agregarEnvio(100, 0);
		Assert.assertEquals(1600, compra.calcularPrecio(), DELTA);
	}
	
	@Test
	public void testCompraconEnvioBonificadoAgregarProductosyCalcularPrecio() {
		Compra compra = new Compra();
		Producto producto = new Producto("MotoG", 5000);
		Producto producto2 = new Producto("Auriculares", 500);
		compra.agregarProductoEnCompra(producto);
		compra.agregarProductoEnCompra(producto2);
		compra.agregarEnvio(100, 5000);
		Assert.assertEquals(5500, compra.calcularPrecio(), DELTA);
	}
	
	@Test
	public void testCompraconEnvioBonificadoPeroNoCorrespondeAgregarProductosyCalcularPrecio() {
		Compra compra = new Compra();
		Producto producto = new Producto("MotoG", 1000);
		Producto producto2 = new Producto("Auriculares", 500);
		compra.agregarProductoEnCompra(producto);
		compra.agregarProductoEnCompra(producto2);
		compra.agregarEnvio(100, 5000);
		Assert.assertEquals(1600, compra.calcularPrecio(), DELTA);
	}
	
	@Test
	public void testCompraconGarantiaAgregarProductosyCalcularPrecio() {
		Compra compra = new Compra();
		Producto producto = new Producto("MotoG", 1000);
		Producto producto2 = new Producto("Auriculares", 500);
		compra.agregarProductoEnCompra(producto);
		compra.agregarProductoEnCompra(producto2);
		compra.agregarGarantia(0.10);
		Assert.assertEquals(1500 * 1.1, compra.calcularPrecio(), DELTA);
	}
	
	@Test
	public void testCompraconEnvioyGarantiaAgregarProductosyCalcularPrecio() {
		Compra compra = new Compra();
		Producto producto = new Producto("MotoG", 1000);
		Producto producto2 = new Producto("Auriculares", 500);
		compra.agregarProductoEnCompra(producto);
		compra.agregarProductoEnCompra(producto2);
		compra.agregarEnvioYGarantia(100, 5000, 0.10);
		Assert.assertEquals((1500 * 1.1) + 100, compra.calcularPrecio(), DELTA);
	}
	
	@Test
	public void testCompraAgregarProductosyDescuentoyCalcularPrecio() {
		Compra compra = new Compra();
		Producto producto = new Producto("MotoG", 3000);
		Producto producto2 = new Producto("Auriculares", 300);
		Cupon cupon = new Cupon(70);
		compra.agregarCuponEnCompra(cupon);
		compra.agregarProductoEnCompra(producto);
		compra.agregarProductoEnCompra(producto2);
		Assert.assertEquals(3300 * (1 - 0.7), compra.calcularPrecio(), DELTA);
	}
	
	@Test
	public void testCompraAgregarProductosyDescuentosyCalcularPrecio() {
		Compra compra = new Compra();
		Producto producto = new Producto("MotoG", 3000);
		Producto producto2 = new Producto("Auriculares", 300);
		Cupon cupon = new Cupon(70);
		Cupon cupon2 = new Cupon(20);
		compra.agregarCuponEnCompra(cupon);
		compra.agregarProductoEnCompra(producto);
		compra.agregarCuponEnCompra(cupon2);
		compra.agregarProductoEnCompra(producto2);
		Assert.assertEquals(3300 * (1 - 0.7), compra.calcularPrecio(), DELTA);
	}
	
}
