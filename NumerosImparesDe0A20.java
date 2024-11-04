import java.util.Scanner;
public class NumerosImparesDe0A20 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner (System.in);
		
		for(int numero = 0; numero <= 20; numero++){
		
		if(numero % 2 == 1){
			System.out.print(numero + " ");
			}
		}
	}
}
