package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n;
		double soma, media;
		
		System.out.print("Quantos números vai digitar? ");
		n = sc.nextInt();
		
		double[] vetor = new double[n];
		
		for (int i = 0; i < n; i++) {
			System.out.print("Digite um número: ");
			vetor[i] = sc.nextDouble();
		}
		
		soma = 0;
		for (int i = 0; i < n; i++) {
			soma = soma + vetor[i];
		}
		
		media = soma / n;
		
		System.out.print("Valores = ");
		
		for (int i = 0 ; i < n; i++) {
			System.out.printf("%.2f  ", vetor[i]);
		}
		
		System.out.printf("\nSoma = %.2f", soma);
		System.out.printf("\nMédia = %.2f", media);
		
		
		
		sc.close();

	}

}
