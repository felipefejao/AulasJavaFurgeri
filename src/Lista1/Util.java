package Lista1;

import javax.swing.JOptionPane;

public class Util {
	public static float getInput(String mensagem) {
		float value = 0;
		try {
			value = Float.parseFloat(JOptionPane.showInputDialog(mensagem));
		}catch(NumberFormatException ex) {
			JOptionPane.showMessageDialog(null, "Número inválido");
			System.exit(0);
		}
		
		return value;
		
	}
	
	public static float getInputEx3(String mensagem) {
		float value = 0;
		try {
			value = Float.parseFloat(JOptionPane.showInputDialog(mensagem));
			if (value < 0 || value > 10) {
				JOptionPane.showMessageDialog(null, "Número inválido");
				System.exit(0);
			}
		}catch(NumberFormatException ex) {
			JOptionPane.showMessageDialog(null, "Número inválido");
			System.exit(0);
		}
		
		return value;
		
	}
	
	public static int getInputInt(String mensagem) {
		int value = 0;
		try {
			value = Integer.parseInt(JOptionPane.showInputDialog(mensagem));
		}catch(NumberFormatException ex) {
			JOptionPane.showMessageDialog(null, "Número inválido");
			System.exit(0);
		}
		
		return value;
		
	}

}
