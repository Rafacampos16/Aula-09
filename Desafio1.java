import java.util.Scanner;
public class Desafio1 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner (System.in);
		
		int numero;
		do{
		System.out.print("Entre com o numero [0 p/ fechar]: ");
		numero = leia.nextInt();
		
		int dezena = numero / 10;
		
		System.out.println("O primeiro numero da dezena eh: " + dezena);
		
		if (dezena % 2 == 0){
			System.out.println("O digito eh par!!");
		} else {
			System.out.println("O digito eh impar!!");
		}
	} while(numero != 0);
}
}

