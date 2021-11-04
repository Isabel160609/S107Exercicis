package s107Nivell1Exercici1;

public class Padre {

	//creamos la clase padre con sus metodos 
	protected String nombre;
	protected int edad;
	
	public Padre(String nombre,int edad) {
		this.nombre=nombre;
		this.edad=edad;
	}
	
	
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}


	@Override
	public String toString() {
		return "Padre [nombre=" + nombre + ", edad=" + edad + "]";
	}


	public void quienSoy() {
		System.out.println("soy el padre");
	}
	
}
