
import java.util.Arrays;
import java.util.Scanner;

public class Escadinha3 {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int soma_s = 0;
        int soma_i = 0;
        int N = scanner.nextInt();
        int[] idades = new int[N];

        for(int i=0; i<N;i++){
            idades[i] = scanner.nextInt();
        }

        if(N == 1){
            System.out.println("S");
            System.out.println();
        }
        if(N > 1){
            
            Arrays.sort(idades);
            for(int i=0; i<N-1; i++){

                int dif = idades[i+1]-idades[i];
                
                if(dif == 1 || dif == 0){
                    soma_s = soma_s + 1;
                }
                
                if(dif > 1){
                    soma_i = soma_i + 1;
                }
            }
            if(soma_s>=1){
                if(soma_s == N-1){
                    System.out.println("S");
                    System.out.println();
                }
                else{
                    System.out.println("N");
                    System.out.println();
                }
            }
            else{
                if(soma_i == N-1){
                   System.out.println("S");
                   System.out.println(); 
                }
                else{
                    System.out.println("N");
                    System.out.println();
                }
            }

        }

    }

}
