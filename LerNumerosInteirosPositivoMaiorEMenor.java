import java.util.Scanner;
public class LerNumerosInteirosPositivoMaiorEMenor {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner (System.in);
		
		int numero, maior = -1, menor = -1, contador = 1;
		
		do{
			System.out.print("Entre com um numero positivo [negativo para sair]: ");
			numero = leia.nextInt();
			
			if(numero >= 0){
			
			if(contador == 1){
				maior = menor = numero;
				
				contador++;
			} else {
				if (numero > maior){
					maior = numero;
				} if (numero < menor){
					menor = numero;
				}
			}
		}
			
		}while(numero >= 0);
		
		if(maior >= 0){
		System.out.print("\nMaior: " + maior);
		System.out.print("\nMenor: " + menor);
	}
	}
}

