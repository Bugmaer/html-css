import java.util.Scanner;

public class fatorial {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int numero;
        do {
            System.out.println("Número: ");
            numero = ler.nextInt();
            if (numero > 0) {
                int numFatorial = fatorialF(numero);
                
                System.out.printf(
                        "Fatorial de %d eh %d\n",
                        numero, numFatorial);
            }
        } while (numero > 0);
    }
    public static int fatorialF (int numero){
        int fatorial = 1;
        for (int i = 1;i <= numero;i++){
            fatorial *= i;
        }
        return fatorial;
        }
}
