import java.util.Scanner;
public class NumerosDivisiveisPor4MenoresQue200 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner (System.in);
		
		for(int numero = 1; numero <= 200; numero++){
		
		if(numero % 4 == 0){
			System.out.print(numero + " ");
			}
		}
	}
}

