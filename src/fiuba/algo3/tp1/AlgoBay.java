package fiuba.algo3.tp1;

public class AlgoBay {
	private ListaDePrecios precios = new ListaDePrecios();
	private double envio = 100, garantia = 0.10, bonificacion = 5000;
	
	public Producto agregarProductoConPrecio(String unProducto, double unPrecio) {
		Producto producto = new Producto(unProducto, unPrecio);
		precios.agregarProducto(producto);
		return producto;
	}
	
	public int getCantidadDeProductos() {
		return precios.getCantidadDeProductos();
	}
	
	public Producto getProducto(String unProducto) {
		return precios.getProducto(unProducto);
	}
	
	public Compra crearNuevaCompra() {
		return new Compra();
	}
	
	public Compra crearNuevaCompraConEnvio() {
		Compra unaCompra = this.crearNuevaCompra();
		unaCompra.agregarEnvio(this.envio, this.bonificacion);
		return unaCompra;
	}
	
	public Compra crearNuevaCompraConGarantia(){
		Compra unaCompra = this.crearNuevaCompra();
		unaCompra.agregarGarantia(this.garantia);
		return unaCompra;
	}
	
	public Compra crearNuevaCompraConEnvioYGarantia() {
		Compra unaCompra = this.crearNuevaCompra();
		unaCompra.agregarEnvioYGarantia(this.envio, this.bonificacion, this.garantia);
		return unaCompra;
	}
	
	public void agregarProductoEnCompra(Producto unProducto, Compra unaCompra){
		unaCompra.agregarProductoEnCompra(unProducto);
	}
	
	public Cupon crearCuponConPorcentaje(double valordeDescuento) {
		return new Cupon(valordeDescuento);
	}
	
	public void agregarCuponEnCompra(Cupon unCuponDeDescuento, Compra unaCompra) {
		unaCompra.agregarCuponEnCompra(unCuponDeDescuento);
	}
	
	public double getPrecioTotalDe(Compra unaCompra) {
		return unaCompra.calcularPrecio();
	}

}
