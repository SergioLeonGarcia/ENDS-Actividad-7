package explainingVariable;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ExplainingVariableTest {

	@Test
	public void test1() {
		ClienteRefactor calcula = new ClienteRefactor(17, 1000);
		double expected = 450.0;
		double actual = calcula.calculaDescuento(450);

		assertEquals("Descuento para 17 años con 1000€: ", actual, expected, 0.01f);
	}

	@Test
	public void test2() {
		ClienteRefactor calcula = new ClienteRefactor(25, 1300);
		double expected = 405.0;
		double actual = calcula.calculaDescuento(450);

		assertEquals("Descuento para 25 años con 1300€: ", actual, expected, 0.01f);
	}
}