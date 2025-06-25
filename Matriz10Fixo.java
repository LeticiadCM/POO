
import java.util.Scanner;

public class Matriz10Fixo {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int[][] matriz = new int[5][5];

        for(int i=0; i<5; i++){
            for(int j=0; j<5; j++){
                matriz[i][j] = scanner.nextInt();
            }
        }

        for(int i=0; i<5; i++){
            for(int j=0; j<5; j++){
                System.out.print(matriz[i][j] * 10);
                if(j < 4){
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }

}
