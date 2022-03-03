
public class Exercicio3 {

	public static void main(String[] args) {
		
		double nota[] = {85.0, 105.0, 40.0, 90.0, 35.0, 65.0, 33.0, 22.0, 19.0, 50.0};
		double somatoriaNota = 0;
		double media;
		
        for (int i = 0; i < nota.length; i++) {
           somatoriaNota = somatoriaNota + nota[i];
        }
        
        media = somatoriaNota / nota.length;   
        System.out.printf("A média é: %.2f" , media);
		

	}

}
