package Lista1;

import javax.swing.JOptionPane;

public class Exercicio2 {

	public static void main(String[] args) {
		float n1 = 0, n2 = 0, n3 = 0;
		
		n1 = Util.getInput("Nota 1");
		n2 = Util.getInput("Nota 2");
		n3 = Util.getInput("Nota 3");
		
		JOptionPane.showMessageDialog(null, "Média: " + (n1 + n2 + n3)/3);
	}
	
	
}
