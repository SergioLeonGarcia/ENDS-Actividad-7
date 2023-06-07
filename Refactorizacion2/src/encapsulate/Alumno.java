package encapsulate;

public class Alumno {
	String nombre;
	int nota;

	public Alumno(String nombre, int nota) {
		this.nombre = nombre;
		this.nota = nota;
	}

	public boolean estaAprobado() {
		return mayorIgual5();
	}

	public boolean mayorIgual5() {
		return nota >= 5;
	}
}
