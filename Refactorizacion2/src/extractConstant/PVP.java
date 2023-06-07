package extractConstant;

public class PVP {
	public double calculaPVP(double precio) {
		double impuestos = (precio * 21) / 100;
		return precio + impuestos;
	}
}
