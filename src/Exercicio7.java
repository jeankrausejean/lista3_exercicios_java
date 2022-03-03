import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		
		int[] vetor = new int[10];
		int contA = 0;
		
		for (int i = 0; i < vetor.length; i++) {
			System.out.printf("Digite o %dº número", (i+1));
			vetor[i] = in.nextInt();
		}
		
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i]%2 == 0) {
				contA++;
			}
		}
		
		int[] vetA = new int[contA];
		int[] vetB = new int[vetor.length - vetA.length];
		
		System.out.print("Vetor Par: ");
		for (int i = 0, j = 0; i < vetor.length; i++) {
			if (vetor[i]%2 == 0) {
				vetA[j] = vetor[i];
				System.out.print(vetA[j] + " ");
				j++;
			}
		}
		   
		System.out.print("\nVetor Impar: ");
		for (int i = 0, j = 0; i < vetor.length; i++) {
			if (vetor[i]%2 != 0) {
				vetB[j] = vetor[i];
				System.out.print(vetB[j] + " ");
				j++;
			}
		}
	   in.close();

	}

}
