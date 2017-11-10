package fiuba.algo3.tp1;

import java.util.ArrayList;

public class Cuponera {
	private ArrayList<Cupon> cupones = new ArrayList<Cupon>();
	
	public void agregarCupon(Cupon unCupon) {
		this.cupones.add(unCupon);
	}
	
	public double aplicarDescuento(double subtotal){
		double valorDeDescuento = 0;
		Cupon unCupon = null;
		for(int i = 0; i < this.cupones.size(); i++) {
			if(valorDeDescuento < cupones.get(i).getDescuento()) {
				valorDeDescuento = cupones.get(i).getDescuento();
				unCupon = cupones.get(i);
			}
		}
		return unCupon.aplicarDescuento(subtotal);
	}
	
	public boolean estavacio() {
		return this.cupones.isEmpty();
	}
}
