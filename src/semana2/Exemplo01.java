package semana2;

import javax.swing.JOptionPane;

public class Exemplo01 {

	public static void main(String[] args) {
		
		String v = JOptionPane.showInputDialog("Digite um numero: ");
		try {
			int x = Integer.parseInt(v);
			System.out.println(v);
			System.out.println(x);
		}
		catch (NumberFormatException error) {
			JOptionPane.showMessageDialog(null, "Somente valores inteiros");
		}
		
	}
}
