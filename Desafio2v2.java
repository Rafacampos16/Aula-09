public class Desafio2v2 {
    public static void main(String[] args) {
        int primeiro = 0, segundo = 1;
        
        System.out.println("Numeros da sequência de Fibonacci de 1 a 10:");
        
        while (segundo <= 34) {
            if (segundo >= 1) {
                System.out.print(segundo + " ");
            }
            int proximo = primeiro + segundo;
            primeiro = segundo;
            segundo = proximo;
        }
    }
}
