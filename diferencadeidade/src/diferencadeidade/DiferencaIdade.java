package diferencadeidade;

import java.util.Scanner;

public class DiferencaIdade {

	public static void main(String[] args) {
		
		try (Scanner in = new Scanner(System.in)) {
			System.out.println("Minha idade é: ");
			int idadeFilha = in.nextInt();
			
			System.out.println("A idade da minha mãe é: ");
			
			int idadeMae = in.nextInt();
			int diferenca = idadeMae - idadeFilha;

			System.out.printf("Minha mãe é %d anos mais velha do que eu!", diferenca);
		}
	}

}
