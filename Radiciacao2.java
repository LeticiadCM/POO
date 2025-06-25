import java.util.Scanner;

public class Radiciacao2 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        long A = scanner.nextLong();

        double rad = Math.sqrt(A);

        System.out.printf("%.4f\n", rad);

    }
    
}
