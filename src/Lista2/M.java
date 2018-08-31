package Lista2;

import javax.swing.JOptionPane;

public class M {
	/**
	 * Rotina Converter
	 * @param s Número entre 1 e 7
	 * @return Dia da semana
	 */
	public String converter(String s) {
		String retorno= "";
		int num = Util.getInputInt("Digite[1-7]:");
		if (num < 1 || num > 7) {
			JOptionPane.showMessageDialog(null, "Opção inválida");
			System.exit(0);
		}
		
		switch (num) {
		case 1:
			retorno = "Domingo";
			break;
		case 2:
			retorno = "Segunda";
			break;
		case 3:
			retorno = "Terça";
			break;
		case 4:
			retorno = "Quarta";
			break;
		case 5:
			retorno = "Quinta";
			break;
		case 6:
			retorno = "Sexta";
			break;
		case 7:
			retorno = "Sábado";
			break;
		}
		
		return retorno;
	}
	
	
}
