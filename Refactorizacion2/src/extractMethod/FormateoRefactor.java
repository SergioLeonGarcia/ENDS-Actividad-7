package extractMethod;

/*
 * -> Refactor / Extract Method
 * Crea tres métodos con buenos nombres para los tres pasos
 * que se dan a la hora de formatear el texto
 */
public class FormateoRefactor {

	public String calculaTexto(String texto) {
		String res = "";

		// Primero se eliminan todos los espacios y se ponen en mayúsculas
		res = extracted(texto);

		// Después se eliminan las vocales
		res = EliminarVocales(res);

		// Finalmente se eliminan todos los caracteres no alfabéticos
		return EliminarNoAlfabeticos(res);
	}

	private String EliminarNoAlfabeticos(String eliminarNoAlfabetico) {
		String txt3 = "";
		for (int i = 0; i < eliminarNoAlfabetico.length(); i++) {
			if (Character.isAlphabetic(eliminarNoAlfabetico.charAt(i))) {
				txt3 += eliminarNoAlfabetico.charAt(i);
			}
		}
		eliminarNoAlfabetico = txt3;

		return eliminarNoAlfabetico;
	}

	private String EliminarVocales(String eliminarVocales) {
		String txt2 = "";
		for (int i = 0; i < eliminarVocales.length(); i++) {
			if (!"AEIOU".contains(String.valueOf(eliminarVocales.charAt(i)))) {
				txt2 += eliminarVocales.charAt(i);
			}
		}
		eliminarVocales = txt2;
		return eliminarVocales;
	}

	private String extracted(String ElimMayus) {
		String res;
		String txt1 = "";
		txt1 = ElimMayus.replace(" ", "");
		res = txt1.toUpperCase();
		return res;
	}
}