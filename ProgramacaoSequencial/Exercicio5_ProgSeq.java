package ProgramacaoSequencial;

import java.util.Scanner;

public class Exercicio5_ProgSeq {

	public static void main(String[] args) {
		// 5. Fa�a um sistema que leia as 3 notas de um aluno e calcule a m�dia final deste aluno. Considerar que a m�dia � ponderada e que o peso das notas �: 2,3 e 5, respectivamente. 
		
		Scanner leia = new Scanner(System.in);
		int nota1,nota2,nota3,media;
		
		System.out.println("Insira a nota1: ");
		nota1 = leia.nextInt();
		System.out.println("Insira a nota2: ");
		nota2 = leia.nextInt();
		System.out.println("Insira a nota3: ");
		nota3 = leia.nextInt();
		
		media = ((nota1+nota2+nota3)/3);
		System.out.println("Sua m�dia foi: "+media);
		media = leia.nextInt();
	}
}
