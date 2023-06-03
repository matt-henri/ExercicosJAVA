package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n, pares;
		
		System.out.print("Quantos números vai digitar? ");
		n = sc.nextInt();
		
		int[] vetor = new int[n];
		
		for (int i = 0; i < n; i++) {
			System.out.print("Digite um número: ");
			vetor[i] = sc.nextInt();
		}
		
		pares = 0;
		
		System.out.println("\nNúmeros Pares: ");
		
		for (int i = 0; i < n; i++) {
			if (vetor[i] % 2 == 0) {
				System.out.print(vetor[i] + " ");
				pares++;
			}
		}
		
		System.out.printf("\n\nQuantidade de números pares = %d", pares);
	
		
		
		sc.close();
		
	}

}
