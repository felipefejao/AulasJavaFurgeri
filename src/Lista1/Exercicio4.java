package Lista1;

import javax.swing.JOptionPane;

public class Exercicio4 {

	public static void main(String[] args) {
		float altura = 0;
		
		altura = Util.getInput("Qual sua altura?");
		
		JOptionPane.showMessageDialog(null, "Peso Ideal: " + ((72.7 * altura) - 58));

	}
	
}
