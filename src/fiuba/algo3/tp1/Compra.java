package fiuba.algo3.tp1;
import java.util.ArrayList;

public class Compra {
	private Envio unEnvio = new Envio(0,0);
	private Garantia unaGarantia = new Garantia(0);
	private ArrayList<Producto> productos = new ArrayList<Producto>();
	private Cuponera cupones = new Cuponera();
	
	public void agregarProductoEnCompra(Producto unProducto) {
		this.productos.add(unProducto);
	}

	public double calcularPrecio() {
		double total = 0;
		for(int i = 0; i < productos.size(); i++) {
			total += productos.get(i).getPrecio();
		}
		double valorDelEnvio = unEnvio.getEnvio(total);
		total =  unaGarantia.calcularGarantia(total) + valorDelEnvio;
		if(!this.cupones.estavacio()) {
			total = this.cupones.aplicarDescuento(total);
		}
		return total;
	}

	public void agregarEnvio(double envio, double bonificacion) {
		this.unEnvio = new Envio(envio, bonificacion);
	}

	public void agregarGarantia(double garantia) {
		this.unaGarantia = new Garantia(garantia);
	}

	public void agregarEnvioYGarantia(double envio, double bonificacion, double garantia) {
		this.agregarEnvio(envio, bonificacion);
		this.agregarGarantia(garantia);
	}

	public void agregarCuponEnCompra(Cupon unCuponDeDescuento) {
		this.cupones.agregarCupon(unCuponDeDescuento);
	}

}
