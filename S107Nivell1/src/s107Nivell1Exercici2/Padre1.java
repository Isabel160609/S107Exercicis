package s107Nivell1Exercici2;

public class Padre1 {

	protected String nombre;

	public Padre1(String nombre) {
		this.nombre = nombre;
	}

	// lo marcamos como deprecated para que se utilice getNombre en su lugar
	@Deprecated
	public String retornarNombre() {
		return this.nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
