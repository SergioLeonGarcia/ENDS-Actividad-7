package extractClass;

import java.util.Date;

// Se hace para extraer de una clase una porción que tiene sentido como clase diferenciada
// Para ello Refactor/Extract Class
public class ClienteRefactor {
	private ClienteRefactorData data = new ClienteRefactorData();

	public ClienteRefactor(String nombre, String dni) {
		this.data.nombre = nombre;
		this.data.dni = dni;
	}

	public boolean estaCaducada() {
		return data.fechaTarjetaCredito.before(new Date());
	}

	public boolean esValidoDni() {
		boolean result = true;
		for (char c : data.dni.toCharArray()) {
			if (!Character.isDigit(c)) {
				result = false;
			}
		}
		return result;
	}

	public String getName() {
		return data.nombre;
	}

	public void setName(String name) {
		this.data.nombre = name;
	}

	public String getDni() {
		return data.dni;
	}

	public void setDni(String dni) {
		this.data.dni = dni;
	}

	public String getCreditCard() {
		return data.tarjetaCredito;
	}

	public void setCreditCard(String creditCard) {
		this.data.tarjetaCredito = creditCard;
	}

	public Date getCreditCardDate() {
		return data.fechaTarjetaCredito;
	}

	public void setCreditCardDate(Date creditCardDate) {
		this.data.fechaTarjetaCredito = creditCardDate;
	}

	public int getCreditCardControlNumber() {
		return data.numeroControTarjetaCredito;
	}

	public void setCreditCardControlNumber(int creditCardControlNumber) {
		this.data.numeroControTarjetaCredito = creditCardControlNumber;
	}

}