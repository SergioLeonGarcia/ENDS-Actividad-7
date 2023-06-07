package explainingVariable;

class ClienteRefactor {
	private int edad;
	private float salario;

	public ClienteRefactor(int edad, float salario) {
		this.edad = edad;
		this.salario = salario;
	}
		
	// Utilizas Refactor/Extract local variable para hacer una expresión menos compleja
	
	public float calculaDescuento(float cantidadTotal) {
		boolean funcionaEdad = (edad >= 18 && edad <= 65);
		boolean salarioBajo = (salario - (salario * 0.5f)) < 1200f;
		boolean cantidadBaja = cantidadTotal * 0.5 < 500;
		
		if (funcionaEdad && salarioBajo && cantidadBaja) {
			return cantidadTotal * 0.9f;
		} else {
			return cantidadTotal;
		}
	}

}
