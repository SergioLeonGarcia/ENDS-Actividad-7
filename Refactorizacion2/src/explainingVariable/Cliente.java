package explainingVariable;

class Cliente {
	private int edad;
	private float salario;

	public Cliente(int edad, float salario) {
		this.edad = edad;
		this.salario = salario;
	}

	public float calculaDescuento(float cantidadTotal) {
		if ((edad >= 18 && edad <= 65) && (salario - (salario * 0.5f)) < 1200f && cantidadTotal * 0.5 < 500) {
			return cantidadTotal * 0.9f;
		} else {
			return cantidadTotal;
		}
	}

}
