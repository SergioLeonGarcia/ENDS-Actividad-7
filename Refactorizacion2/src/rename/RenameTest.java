package rename;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RenameTest {
   
	@Test
	public void test1() {
		ClienteRefactor calcula = new ClienteRefactor();
		double expected = 10;
		double actual = calcula.areaFinal(5d,2d);
    		
		assertEquals("Área del rectángulo de 5x2: ", actual, expected, 0.01f);
	}
  
	@Test
	public void test2() {
		ClienteRefactor calcula = new ClienteRefactor();
		double expected = 6;
		double actual = calcula.areaFinal(2d,3d);
    		
		assertEquals("Área del rectángulo de 2x3: ", actual, expected, 0.01f);
	}
}