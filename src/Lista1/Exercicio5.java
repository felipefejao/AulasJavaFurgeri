package Lista1;

import javax.swing.JOptionPane;

public class Exercicio5 {

	public static void main(String[] args) {
		float iptu = Util.getInput("Valor IPTU");
		JOptionPane.showMessageDialog(null, "Valor com 5% de desconto: R$ " + (iptu - (iptu * 0.05)));
	}

}
