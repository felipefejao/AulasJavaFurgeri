package semana2;

import javax.swing.JOptionPane;

public class Exemplo02 {

	public static void main(String[] args) {
		String v1 = JOptionPane.showInputDialog("Digite um numero: ");
		String v2 = JOptionPane.showInputDialog("Digite um numero: ");
		
		try {
			int x = Integer.parseInt(v1);
			int y = Integer.parseInt(v2);
			int z = x/y;
			
			System.out.println(z);
			
		}
		catch (NumberFormatException error) {
			JOptionPane.showMessageDialog(null, "Somente valores inteiros");
		}
		catch (ArithmeticException error) {
			JOptionPane.showMessageDialog(null, "Divisão por zero");
		}

	}

}
