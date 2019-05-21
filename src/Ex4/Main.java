package Ex4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Digite um numero para receber seu fatorial :");
		long num = s.nextLong();
		for (int i = 0; i < 2; i++) {
			Fatorial f = new Fatorial(num,i);
			f.run();
		}
	}

}
