package fiuba.algo3.tp1;

import static org.junit.Assert.fail;

import org.junit.Assert;
import org.junit.Test;


public class EnvioTest {
	
	private static final double DELTA = 1e-15;
	@Test
	public void testCrearEnvioConValor100(){
		Envio envio = new Envio(100, 0);
		Assert.assertEquals(100, envio.getEnvio(300), DELTA);
	}
	
	@Test
	public void testEnvioBonificado() {
		Envio envio = new Envio(100, 5000);
		Assert.assertEquals(0, envio.getEnvio(5100), DELTA);
	}
	
	@Test
	public void testCrearEnvioValorInvalidoException(){
		try {
			new Envio(-100, 0);
			fail("La prueba fallo");
		}
		catch(ValorInvalidoException exception){
		}
	}
	
	

}
