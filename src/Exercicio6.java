import javax.swing.JOptionPane;

public class Exercicio6 {

	public static void main(String[] args) {
		 int vetor[] = {56, 48, 9, 48, 60, 13, 24, 27, 13, 56, 85, 9, 48, 55, 9};
         
		    int pesquisa = Integer.parseInt(JOptionPane.showInputDialog("Valor:"));
		         
		    int cont = 0;
		    for(int i = 0; i < vetor.length; i++){
		      if(vetor[i] == pesquisa){
		        cont++; 
		      }
		    }
		         
		    JOptionPane.showMessageDialog(null, "O valor foi encontrado: " +
		      cont + " vezes");
	}

}
