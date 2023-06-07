package extractConstant;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ExtractConstantTest {

	@Test
	public void test1() {
		PVPRefactor calcula = new PVPRefactor();
		double expected = 121;
		double actual = calcula.calculaPVP(100);

		assertEquals("100 con IVA : ", actual, expected, 0.01f);
	}

	@Test
	public void test2() {
		PVPRefactor calcula = new PVPRefactor();
		double expected = 60.5;
		double actual = calcula.calculaPVP(50);

		assertEquals("100 con IVA : ", actual, expected, 0.01f);
	}
}