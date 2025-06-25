
import java.util.Scanner;

public class Matriz10 {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int M = scanner.nextInt();

        int[][] matriz = new int[N][M];

        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                matriz[i][j] = scanner.nextInt();
            }
        }

        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                System.out.print(matriz[i][j] * 10);
                if(j < M-1){
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }

}
