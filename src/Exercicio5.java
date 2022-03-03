import javax.swing.JOptionPane;

public class Exercicio5 {

	public static void main(String[] args) {
		 int vetor[] = {91, 10, 50, 89, 45, 80, 2, 45, 3, 105, 95, 13, 26, 49, 50};
         
		    int pesquisa = Integer.parseInt(JOptionPane.showInputDialog("Valor:"));
		         
		    boolean encontrado = false;
		    for(int i = 0; i < vetor.length; i++){
		      if(vetor[i] == pesquisa){
		        encontrado = true;
		        break;
		      }
		    }
		         
		    if(encontrado){
		       JOptionPane.showMessageDialog(null, "O valor está no vetor");
		    }
		    else{
		       JOptionPane.showMessageDialog(null, "O valor não está no vetor");
		    }

	}

}
