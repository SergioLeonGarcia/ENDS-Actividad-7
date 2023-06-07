package extractClass;

import java.util.Date;

public class Cliente {
	private String nombre;
	private String dni;
	private String tarjetaCredito;
	private Date fechaTarjetaCredito;
	private int numeroControTarjetaCredito;

	public Cliente(String nombre, String dni) {
		this.nombre = nombre;
		this.dni = dni;
	}

	public boolean estaCaducada() {
		return fechaTarjetaCredito.before(new Date());
	}

	public boolean esValidoDni() {
		boolean result = true;
		for (char c : dni.toCharArray()) {
			if (!Character.isDigit(c)) {
				result = false;
			}
		}
		return result;
	}

	public String getName() {
		return nombre;
	}

	public void setName(String name) {
		this.nombre = name;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getCreditCard() {
		return tarjetaCredito;
	}

	public void setCreditCard(String creditCard) {
		this.tarjetaCredito = creditCard;
	}

	public Date getCreditCardDate() {
		return fechaTarjetaCredito;
	}

	public void setCreditCardDate(Date creditCardDate) {
		this.fechaTarjetaCredito = creditCardDate;
	}

	public int getCreditCardControlNumber() {
		return numeroControTarjetaCredito;
	}

	public void setCreditCardControlNumber(int creditCardControlNumber) {
		this.numeroControTarjetaCredito = creditCardControlNumber;
	}

}