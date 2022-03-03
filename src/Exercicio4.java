
public class Exercicio4 {

	public static void main(String[] args) {
		
		int vetor[] =  {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	     
		  System.out.println("Ordem original:\n");
		 
		  for(int i = 0; i < vetor.length; i++){
		    System.out.print(vetor[i] + "  ");
		  }
		 
		  System.out.println("\n\nOrdem o:\n");
		 
		  for(int i = vetor.length - 1; i >= 0; i--){
		    System.out.print(vetor[i] + "  ");
		  }
	}

}
