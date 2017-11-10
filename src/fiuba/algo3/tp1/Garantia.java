package fiuba.algo3.tp1;

public class Garantia {
	private double porcentajeDeGarantia;
	
	public Garantia( double unValor) {
		if (unValor < 0) {
			throw new ValorInvalidoException("El valor de la Garantia es negativo");
		}
		this.porcentajeDeGarantia = unValor;
		
	}
	
	public double calcularGarantia(double subtotal) {
		return subtotal * (this.porcentajeDeGarantia + 1);
	}
}
