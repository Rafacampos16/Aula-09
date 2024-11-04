import java.util.Scanner;
public class Fatorialv2 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner (System.in);
		
		int numero;
		int fatorial = 1;
		
		System.out.print("Entre com um numero para calcular o fatorial: ");
		numero = leia.nextInt();
		
		for (int contador = numero ; contador  >= 1; contador--){
			//fatorial = fatorial * contador;
			fatorial*= contador;
		}
		System.out.println("\nO fatorial eh: " + fatorial);
	}
}

