package pushDown;

public class Coche extends Vehiculo {
	private String maletero;
	private boolean abiertoMaletero;
	protected String plate;
	protected Seguro insurance;
	

	public boolean estaAbiertoMaletero() {
		return abiertoMaletero;
	}


	public String arrancar() {
		return "Brummm, brummm";
	}
}