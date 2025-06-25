import java.util.Scanner;

public class Potenciacao {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int N = scanner.nextInt();

        double potencia = Math.pow(A, N);

        System.out.printf("%.4f\n", potencia);

    }
    
}
