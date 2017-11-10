package fiuba.algo3.tp1;

public class Bonificacion {
	private double valorDeBonificacion;
	
	public Bonificacion(double unvalorDeBonificacion) {
		if (unvalorDeBonificacion < 0) {
			throw new  ValorInvalidoException("El valor de la bonificacion es negativo");
		}
		this.valorDeBonificacion = unvalorDeBonificacion;
	}

	public boolean correspondebonificacion(double subtotal) {
		if(subtotal > this.valorDeBonificacion && this.valorDeBonificacion != 0) {
			return false;
		}
		return true;
	}

}
