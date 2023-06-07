package encapsulate;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class EncapsulateTest {

	@Test
	public void test1() {
		AlumnoRefactor calcula = new AlumnoRefactor("Pedro", 5);
		boolean actual = calcula.estaAprobado();

		assertTrue("Pedro con nota 5 : ", actual);
	}

	@Test
	public void test2() {
		AlumnoRefactor calcula = new AlumnoRefactor("Jaime", 3);
		boolean actual = calcula.estaAprobado();

		assertFalse("Jaime con nota 3 : ", actual);
	}
}