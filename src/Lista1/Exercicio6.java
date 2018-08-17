package Lista1;

import javax.swing.JOptionPane;

public class Exercicio6 {
	public static void main(String[] args) {
		String n1 = JOptionPane.showInputDialog("Digite um número");
		
		try {
			int conv = Integer.parseInt(n1);
			
			JOptionPane.showMessageDialog(null, "É inteiro");
		}catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Não é inteiro");
		}
	}
}
