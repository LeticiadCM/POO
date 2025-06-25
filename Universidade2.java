import java.util.Scanner;

public class Universidade2
{
    public static void main(String[] args) {
        //String universidade;
        //int anos;

        Scanner scanner = new Scanner(System.in);

        String universidade = scanner.next();
        int anos = scanner.nextInt();

        System.out.print("Onde você estuda:\n");  
        System.out.print("Quanto tempo:\n");
        System.out.printf("Você estuda na %s há %d anos.\n", universidade, anos);
    }

}