import java.util.Scanner;

public class EscadaRolante {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        while (true) {

            int N = scanner.nextInt();
            int T = 10;
            int[] pessoas = new int[N];
            
            if(N == 0){
                break;
            }

            for(int i=0; i<N; i++){
                pessoas[i] = scanner.nextInt();

            }

            for(int i=1; i<N; i++){
                int dif = pessoas[i]-pessoas[i-1];
                if(dif<10){
                    T=T+dif;
                }
                else{
                    T=T+10;
                }
            }

            System.out.println(T);
            
        }
    }
}
