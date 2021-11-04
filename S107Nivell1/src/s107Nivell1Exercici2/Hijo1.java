package s107Nivell1Exercici2;

public class Hijo1 extends Padre1 {

	protected int edad;

	public Hijo1(String nombre, int edad) {
		super(nombre);
		this.edad = edad;
	}

	// lo marcamos como deprecated para que se utilice getedad en su lugar
	@Deprecated
	public int retornarEdad() {
		return this.edad;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

}
