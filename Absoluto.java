import java.util.Scanner;

public class Absoluto {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int X = scanner.nextInt();

        int absoluto = Math.abs(X);

        System.err.printf("%d\n", absoluto);
    }
    
}
