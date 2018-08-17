package Lista1;

import javax.swing.JOptionPane;

public class Exercicio3 {

	public static void main(String[] args) {
		float valor = 0, horas = 0;
		
		valor = Util.getInput("Valor por hora");
		horas = Util.getInput("Quantas horas?");
		
		JOptionPane.showMessageDialog(null, "Seu valor pelas horas: " + valor * horas);
	}
	
	

}
