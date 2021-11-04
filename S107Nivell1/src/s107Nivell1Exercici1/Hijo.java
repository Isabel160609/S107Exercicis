package s107Nivell1Exercici1;

public class Hijo extends Padre{
	
	private int peso;
	//La clase hija que deriba de padre
	public Hijo(String nombre, int edad,int peso) {
		//llamamos al constructor del padre
		super(nombre, edad);
		this.peso=peso;
	}
	
	//sobreescribimos el metodo
@Override
	public String toString() {
		return "Hijo [nombre=" + nombre + ", edad=" +edad+", peso=" + peso + "]";
	}


	//sobreescribimos el metodo
	@Override
	public void quienSoy() {
		System.out.println("soy el hijo");
	}

}
