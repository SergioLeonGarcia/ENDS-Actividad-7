package pushDown;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PushDownTest {

	@Test
	public void test1() {
		Vehiculo calcula = new Coche();
		String expected = "Brummm, brummm";
		String actual = ((Coche) calcula).arrancar();

		assertEquals("Arrancar el coche :", actual, expected);
	}

	@Test
	public void test2() {
		Vehiculo calcula = new Moto();
		String expected = "Brummm, brummm";
		String actual = ((Moto) calcula).arrancar();

		assertEquals("Arrancar la moto :", actual, expected);
	}
}