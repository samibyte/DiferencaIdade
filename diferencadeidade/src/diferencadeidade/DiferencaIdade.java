package diferencadeidade;

import java.util.Scanner;

public class DiferencaIdade {

	public static void main(String[] args) {
		
		try (Scanner in = new Scanner(System.in)) {
			System.out.println("Minha idade �: ");
			int idadeFilha = in.nextInt();
			
			System.out.println("A idade da minha m�e �: ");
			
			int idadeMae = in.nextInt();
			int diferenca = idadeMae - idadeFilha;

			System.out.printf("Minha m�e � %d anos mais velha do que eu!", diferenca);
		}
	}

}
