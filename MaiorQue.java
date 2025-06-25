
import java.util.Scanner;

public class MaiorQue {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        long A = scanner.nextLong();
        long B = scanner.nextLong();

        boolean resultado = A >= B;

        System.out.printf("%b\n", resultado);

    }
    
}
