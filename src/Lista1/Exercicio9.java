package Lista1;

import javax.swing.JOptionPane;

public class Exercicio9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			switch (Integer.parseInt(args[0])) {
			case 0:
				JOptionPane.showMessageDialog(null,"Zero");
				break;
			case 1:
				JOptionPane.showMessageDialog(null,"Um");
				break;
			case 2:
				JOptionPane.showMessageDialog(null,"Dois");
				break;
			case 3:
				JOptionPane.showMessageDialog(null,"Três");
				break;
			case 4:
				JOptionPane.showMessageDialog(null,"Quatro");
				break;
			case 5:
				JOptionPane.showMessageDialog(null,"Cinco");
				break;
			case 6:
				JOptionPane.showMessageDialog(null,"Seis");
				break;
			case 7:
				JOptionPane.showMessageDialog(null,"Sete");
				break;
			case 8:
				JOptionPane.showMessageDialog(null,"Oito");
				break;
			case 9:
				JOptionPane.showMessageDialog(null,"Nove");
				break;
			default:
				JOptionPane.showMessageDialog(null,"Dado inválido");
				break;
			}
		}catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Dado inválido");
			System.exit(0);
		}
		
	}

}
