
import java.util.Arrays;
import java.util.Scanner;

public class Escadinha2 {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int soma = 0;
        int N = scanner.nextInt();
        int[] idades = new int[N];

        for(int i=0; i<N;i++){
            idades[i] = scanner.nextInt();
        }

        if(N == 1){
            System.out.println("S");
        }
        if(N > 1){
            
            Arrays.sort(idades);
            for(int i=0; i<N-1; i++){

                int dif = idades[i+1]-idades[i];
                
                if(dif == 1 || dif == 0){
                    soma = soma + 1;
                } 
            }

            if(soma == N-1){
                System.out.println("S");
            }
            else{
                System.out.println("N");
            }

        }

    }

}
