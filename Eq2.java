import java.util.Scanner;

public class Eq2 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        double A = scanner.nextDouble();
        double B = scanner.nextDouble();
        double C = scanner.nextDouble();

        double delta = B*B-4*A*C;

        double raiz1 = (-B + Math.sqrt(delta))/(2*A);
        double raiz2 = (-B - Math.sqrt(delta))/(2*A);

        System.out.printf("%.4f %.4f\n", raiz1, raiz2);

    }
    
}
