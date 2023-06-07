package encapsulate;

/*
 *->  Refactor / Encapsulate Field
 * Los atributos nombre y nota deben ser privados
 * El método mayorIgual5 debe ser privado
 * Luego ejecuta el Test JUnit para comprobar que es correcto 
 */
public class AlumnoRefactor {
	private String nombre;         // Picas en los nombres y Refactor/ Encapsulate Field
	private int nota;

	public AlumnoRefactor(String nombre, int nota) {
		this.setNombre(nombre);
		this.setNota(nota);
	}

	public boolean estaAprobado() {
		return mayorIgual5();
	}

	private boolean mayorIgual5() {
		return getNota() >= 5;
	}

	String getNombre() {
		return nombre;
	}

	void setNombre(String nombre) {
		this.nombre = nombre;
	}

	int getNota() {
		return nota;
	}

	void setNota(int nota) {
		this.nota = nota;
	}
}
