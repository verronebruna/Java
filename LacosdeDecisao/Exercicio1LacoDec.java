package LacosdeDecisao;

import java.util.Scanner;

public class Exercicio1LacoDec {

	public static void main(String[] args) {
/*1 - fa�a um programa que receba tr�s n�meros inteiros e diga qual deles � o maior.*/
		
		Scanner leia = new Scanner(System.in);
		int N1,N2,N3;
		int maior=0;
		
		System.out.println("Insira o n�mero 1: ");
		N1 = leia.nextInt();
		System.out.println("Insira o n�mero 2: ");
		N2 = leia.nextInt();
		System.out.println("Insira o n�mero 3: ");
		N3 = leia.nextInt();
		
		if((N1 > N2) && (N1 > N3))
			maior = N1;
		else if((N2 > N1) && (N2 > N3))
			maior = N2;
		else if((N3 > N1) && (N3 > N2))
			maior = N3;
			
			System.out.println("Maior valor: "+maior);
	}

}
