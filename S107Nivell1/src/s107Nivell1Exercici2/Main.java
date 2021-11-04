package s107Nivell1Exercici2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Hijo1 hijo = new Hijo1("pepe", 12);

		System.out.println(hijo.getNombre());

		// como lo hemos marcado como deprecated en el padre aqui nos informa para que
		// no lo utilicemos
		// aunque vemos que funciona perfectamente
		System.out.println(hijo.retornarNombre());

		System.out.println(hijo.getEdad());
		// como lo hemos marcado como deprecated en el hijo aqui nos informa para que
		// no lo utilicemos
		// aunque vemos que funciona perfectament
		System.out.println(hijo.retornarEdad());
	}

}
