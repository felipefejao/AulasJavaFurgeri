package semana2;

import java.math.BigDecimal;

public class Exemplo04 {

	public static void main(String[] args) {
		
		double a = 0.1;
		double b = 0.2;
		double c = a+b;
		
		System.out.println(c);
		
		float d = 0.1f;
		float e = 0.2f;
		float f = d+e;
		
		System.out.println(f);
		
		BigDecimal j =  new BigDecimal("0.1");
		BigDecimal k =  new BigDecimal("0.2");
		BigDecimal m = j.add(k);
		System.out.println(m);
		
		
		
	}

}
