package extractMethod;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ExtractMethodTest {

	@Test
	public void test1() {
		FormateoRefactor calcula = new FormateoRefactor();
		String expected = "HLMGS";
		String actual = calcula.calculaTexto("---Hola amigos. ");

		assertEquals("---Hola amigos. :", actual, expected);
	}

	@Test
	public void test2() {
		FormateoRefactor calcula = new FormateoRefactor();
		String expected = "SLBNSLML";
		String actual = calcula.calculaTexto("¿Sale bien, sale mal? ");

		assertEquals("¿Sale bien, sale mal? :", actual, expected);
	}
}