package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num, pares;
		
		System.out.print("Quantos números você vai digitar? ");
		num = sc.nextInt();
		
		int[] vetor = new int[num];
		
		for (int i=0; i<num; i++) {
			System.out.print("Digite um número: ");
			vetor[i] = sc.nextInt();
		}
		
		System.out.print("\nNumeros Pares: ");
		
		
		pares = 0;
		for (int i=0; i<num; i++) {
			if (vetor[i] % 2 == 0) {
				System.out.printf("%d ", vetor[i]);
				pares++;
			}
		}
		
		System.out.printf("\n\nQuantidade de Pares = %d\n", pares);
		
		sc.close();
	}

}
