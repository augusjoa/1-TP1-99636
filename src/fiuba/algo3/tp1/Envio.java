package fiuba.algo3.tp1;

public class Envio {
	private double valordeEnvio;
	private Bonificacion bonificacion;
	
	public Envio(double unValor, double unValorDeBonificacion) {
		if (unValor < 0) {
			throw new  ValorInvalidoException("El valor del envio es negativo");
		}
		 
		this.valordeEnvio = unValor;
		this.bonificacion = new Bonificacion(unValorDeBonificacion);
	}
	
	public double getEnvio(double subtotal) {
		if (this.bonificacion.correspondebonificacion(subtotal)){
			return this.valordeEnvio;
		}
		return 0;
	}
}
