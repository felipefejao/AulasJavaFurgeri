package Lista1;

public class Exercicio7 {
	public static void main(String[] args) {
		int i = 0;
		
		do {
			if (i == 0) {
				i = 1;
				System.out.println(i);
				
			}else {
				int soma = i+i;
				System.out.println(soma);
				i = soma;
				
			}
		}while(i < 2048);
	}
}
