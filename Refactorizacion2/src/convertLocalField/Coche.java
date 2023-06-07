package convertLocalField;

/*
 * -> Refactor / Convert Local Variable to Field...
 * Seleccionad la variable local kilometros y convertirla en Atributo
 * Elegid la opción de inicializarla en el constructor
 */

public class Coche {

	private int kilometros;

	public Coche() {
		kilometros = 0;             //Cogemos la variable kilometros y Refractor -> Construir variable a field		
	}                               // e inicializarla en el constructor

	public void conducir (int distancia) {
		kilometros += distancia;
	}
	
}
