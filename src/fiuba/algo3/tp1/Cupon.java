package fiuba.algo3.tp1;

public class Cupon {
	private double valorDeDescuento;
	
	public Cupon(double unValorDeDescuento) {
		if(unValorDeDescuento <= 0 || unValorDeDescuento >= 100) {
			throw new ValorInvalidoException("El valor del Cupon es invalido");
		}
		this.valorDeDescuento = unValorDeDescuento;
	}
	
	public double aplicarDescuento(double subtotal) {
		double multiplicador = 1 - (this.valorDeDescuento / 100);
		return subtotal * multiplicador;
	}

	public double getDescuento() {
		return this.valorDeDescuento;
	}
}
