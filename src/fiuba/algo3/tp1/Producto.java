package fiuba.algo3.tp1;

public class Producto {
	private String nombre;
	private double precio;
	
	public Producto(String unnombre, double unprecio) {
		if (unprecio <= 0) throw new ValorInvalidoException("El precio del es cero o negativo");
		this.nombre = unnombre;
		this.precio = unprecio;
	}

	public String getNombre() {
		return this.nombre;
	}
	
	public double getPrecio() {
		return this.precio;
	}

}
