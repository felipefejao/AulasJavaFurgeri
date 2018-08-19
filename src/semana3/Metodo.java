package semana3;
/**
 * Classe de Métodos
 * @author Union
 *
 */
public class Metodo {
	public static void imprimir() {
		System.out.println("Apostila de Java");
	}
	
	public static void imprimir(String texto) {
		System.out.println(texto);
		System.out.println(texto.length());
	}
	
	public static void imprimir(int a) {
		System.out.println(a);
	}
	
	public static void gerar() {
		System.out.println((int)(Math.random()*10000));
	}
	public  static void gerar(int limite) {
		System.out.println((int)(Math.random()*limite));
	}
	/**
	 * Lança número de 1 a 6
	 * 
	 */
	public static void lancardados() {
		System.out.println(1+(int)(Math.random()*5));
		
		lancardados();
	}
	
	public static void somar(int a, int b) {
		System.out.println(a+b);
	}
	
	
}
