package extractMethod;

public class Formateo {

	public String calculaTexto(String texto) {
		String res = "";

		// Primero se eliminan todos los espacios y se ponen en mayúsculas
		String txt1 = "";
		txt1 = texto.replace(" ", "");
		res = txt1.toUpperCase();

		// Después se eliminan las vocales
		String txt2 = "";
		for (int i = 0; i < res.length(); i++) {
			if (!"AEIOU".contains(String.valueOf(res.charAt(i)))) {
				txt2 += res.charAt(i);
			}
		}
		res = txt2;

		// Finalmente se eliminan todos los caracteres no alfabéticos
		String txt3 = "";
		for (int i = 0; i < res.length(); i++) {
			if (Character.isAlphabetic(res.charAt(i))) {
				txt3 += res.charAt(i);
			}
		}
		res = txt3;

		return res;
	}
}