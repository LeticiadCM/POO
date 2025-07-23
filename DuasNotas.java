import java.util.Scanner;

public class DuasNotas {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int[] notas = {2, 5, 10, 20, 50, 100};
        
        while (true) { 
            int N = scanner.nextInt();
            int M = scanner.nextInt();

            if(M == 0 && N == 0){
                break;
            }

            int troco = M - N;
            boolean possible = false;

            for(int i=0; i<6;i++){
                for(int j=0; j<6; j++){
                    if((notas[i] + notas[j] == troco)){
                        possible = true;
                    }
                }
                if(possible){
                    break;
                }
            }

            if (possible) {
                System.out.println("possible");
            } else {
                System.out.println("impossible");
            }

        }
    }


}
    
