package Lista1;

import javax.swing.JOptionPane;

public class Exercicio6 {
	public static void main(String[] args) {
		String n1 = JOptionPane.showInputDialog("Digite um n�mero");
		
		try {
			int conv = Integer.parseInt(n1);
			
			JOptionPane.showMessageDialog(null, "� inteiro");
		}catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "N�o � inteiro");
		}
	}
}
