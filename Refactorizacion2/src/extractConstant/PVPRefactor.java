package extractConstant;

/*
 * -> Refactor/Extract Constant
 * Crea un atributo privado y constante IVA para sustituir el valor 21
 * Luego ejecuta el Test JUnit para comprobar que es correcto 
 */

public class PVPRefactor {
	private static final int IVA = 21;     // En el valor 21 picas en Refactor/Extract Constant

	public double calculaPVP(double precio) {
		double impuestos = (precio * IVA) / 100;
		return precio + impuestos;
	}
}
