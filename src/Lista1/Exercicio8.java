package Lista1;
import javax.swing.JOptionPane;


import Lista1.Util;

public class Exercicio8 {

	public static void main(String[] args) {
		double total = 0;
		double valor = 1;
		do {
			 valor = Util.getInput("Digite um valor");
			 total += valor;
			
		}while(valor != 0);
		
		JOptionPane.showMessageDialog(null, "Total: " + total);
	}

}
