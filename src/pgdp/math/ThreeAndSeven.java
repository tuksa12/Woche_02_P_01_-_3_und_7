package pgdp.math;

import static pgdp.MiniJava.*;

public class ThreeAndSeven {
	public static void main(String[] args) {

		int n = readInt("Bitte Zahl eingeben:");
		int sum = 0;

		if (n >= 0) {
			while (n > 0) {
				if (n % 3 == 0 || n % 7 == 0) {
					sum += n;
				}
				n--;
			}
			write(sum);
		}
		else
			write("Fehler: n>=0 erwartet!");

	}
}//Trocar o loop de lugar. Ao inves de colocar depois do if, colocar depois do else.