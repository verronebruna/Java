package LacodeRepeticao;

import java.util.Scanner;

public class Exercicio2_LacoFor {

	public static void main(String[] args) {
		//Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR)

		int x;
		int valorPar = 0,valorImpar = 0,contador;
		
		Scanner ler = new Scanner(System.in);
		
		for(x=0;x<=10;x++) {
			System.out.printf("\nN�mero "+x);
									
			for(contador =0; contador <=0; contador++)
			{				
				if(x % 2 == 0)
				{
					valorPar ++ ;
				}
				else
				{
					valorImpar ++ ;
				}
			}
			System.out.printf("\nNessa sequ�ncia tem %d numero(s) �mpar(es). ",valorImpar);
			System.out.printf("\nNessa sequ�ncia tem %d numero(s) par(es).",valorPar);
			}	
		}
	}
