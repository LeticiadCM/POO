import java.util.Scanner;

public class RestoDaDivisaoInteira 
{

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();

        int resto = A%B;

        System.out.printf("%d\n", resto);

    }
    
}
