import java.util.Scanner;

public class Caracteres2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char A = scanner.next().charAt(0);
        char B = scanner.next().charAt(0);
        char C = scanner.next().charAt(0);

        System.out.printf("%c\n%c\n%c\n", C, B, A);

    }
}
