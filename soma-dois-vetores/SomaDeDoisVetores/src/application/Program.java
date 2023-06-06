package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n;
		
		
		System.out.print("Quantos valores vai ter cada vetor? ");
		n = sc.nextInt();
		
		int[] vetorA = new int[n];
		int[] vetorB = new int[n];
		int[] soma   = new int[n];
		
		
		System.out.println("Ditite os valores do vetor A: ");
		for (int i = 0; i < n; i++) {
			
			vetorA[i] = sc.nextInt();
		}
		
		System.out.println("Ditite os valores do vetor B: ");
		for (int i = 0; i < n; i++) {
			
			vetorB[i] = sc.nextInt();
		}
		
		for (int i = 0; i < n; i++) {
			soma[i] = vetorA[i] + vetorB[i];
		}
		
		System.out.println("Valor resultante:");
		
		for (int i = 0; i < n; i++) {
			System.out.printf("%d\n", soma[i]);
		}
		
		sc.close();
			
	}

}
