/*Exercici 1. Creu una jerarquia d'objectes Java on els objectes fill sobreescriguin alguna funcionalitat de l'objecte pare
 *  emprant @Override.
Afegeixi una classe que efectuï les invocacions necessàries demostrant el punt anterior.*/

package s107Nivell1Exercici1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//cuando llamamos al padre utiliza los metodos del padre
		Padre padre=new Padre("Pepe",40);
		padre.quienSoy();
		System.out.println(padre.toString());
		//cuando llamamos al hijo yutiliza los metodos del hijo
		Hijo hijo =new Hijo("Josep",12,40);
		hijo.quienSoy();
		System.out.println(hijo.toString());
		
		
	}

}
