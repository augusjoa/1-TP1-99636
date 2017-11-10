package fiuba.algo3.tp1;

import java.util.Hashtable;

public class ListaDePrecios {
	private Hashtable<String, Producto> precios = new Hashtable<String, Producto>();
	
	public void agregarProducto(Producto producto) {
		precios.put(producto.getNombre(), producto);
	}
	
	public Producto getProducto(String unProducto) {
		if (precios.get(unProducto) == null) throw new ValorNoEncontradoException("El producto no fue encontrado");
		return precios.get(unProducto);
	}
	
	public int getCantidadDeProductos() {
		return precios.size();
	}
}
