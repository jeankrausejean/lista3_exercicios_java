
public class Exercicio4 {
	
		//Corrigido!!!
	
	public static void main(String[] args) {
		
		int vetor[] =  {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	     
		//Primeira solução
		
		/*for (int valor : vetor) {
			System.out.println(valor + "" + ((valor - vetor.length) - 1));
		}*/
		
		//segunda solução
		
		int controle = vetor.length -1;
		for (int i = 0; i < vetor.length; i++) {
		System.out.println( vetor[i] + " - " + vetor[controle]);
		controle--;
		}
	}

}
