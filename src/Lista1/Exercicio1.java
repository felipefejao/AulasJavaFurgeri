package Lista1;

import javax.swing.JOptionPane;

public class Exercicio1 {

	public static void main(String[] args) {
		float n1 = 0 , n2 = 0;
		
		try {
			n1 = Float.parseFloat(JOptionPane.showInputDialog("Num 1: "));
			
		}catch(NumberFormatException ex) {
			JOptionPane.showMessageDialog(null, "N�mero inv�lido", "Erro", 0);
		}
		
		try {
			n2 = Float.parseFloat(JOptionPane.showInputDialog("Num 2: "));
			
		}catch(NumberFormatException ex) {
			JOptionPane.showMessageDialog(null, "N�mero inv�lido", "Erro", 0);
		}
		
		JOptionPane.showMessageDialog(null, "Soma = " + (n1 + n2) +"\nSubtracao = " + (n1 - n2) + 
											"\nMultiplaca��o = " + (n1 * n2) + "\nDivis�o = " + (n1 / n2));
		
	}

}
