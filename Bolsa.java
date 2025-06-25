
import java.util.Arrays;
import java.util.Scanner;

public class Bolsa {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int pos = 0;

        while(true){

            int N = scanner.nextInt();

            if(N == 0){
                break;
            }

            int[] V = new int[N];

            for(int i=0; i<N; i++){
                V[i] = scanner.nextInt();
            }

            int[] ordenado = Arrays.copyOf(V, N);
            Arrays.sort(ordenado);

            int segundoMaior = ordenado[N - 2];

            for(int i=0; i<N; i++){
                if(V[i] == segundoMaior){
                    pos = i+1;
                }
            }

            System.out.printf("%d\n", pos);

        }

    }
    
}
