import java.util.Scanner;
public class Teste {

	
	   public static void main(String[] args) {
		// declara, constrói e inicializa uma matriz de 10 inteiros
		    int valores[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		    int temp;
		     
		    // vamos mostar a ordem inicial dos elementos na matriz
		    System.out.print("Ordem inicial: ");
		    for(int i = 0; i < valores.length; i++){
		      System.out.print(valores[i] + "   ");  
		    }
		     
		    // vamos inverter a ordem dos elementos na matriz
		    int inicio = 0, fim = valores.length - 1;  
		    while(inicio < fim){
		      temp = valores[inicio];
		      valores[inicio] = valores[fim];
		      valores[fim] = temp;
		      // incrementa e decrementa as variáveis de controle
		      inicio++; 
		      fim--;
		    }
		     
		    // vamos mostar a ordem invertida dos elementos na matriz
		    System.out.print("\nOrdem invertida: ");
		    for(int i = 0; i < valores.length; i++){
		      System.out.print(valores[i] + "   ");  
		    }
		     
		    System.out.println();
	   
	}
}
	
