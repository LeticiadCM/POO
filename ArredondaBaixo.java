
import java.util.Scanner;

public class ArredondaBaixo {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        double N = scanner.nextDouble();

        double arredondado = Math.floor(N);

        System.out.printf("%.4f\n", arredondado);

    }
    
}
