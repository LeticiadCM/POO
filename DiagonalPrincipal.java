import java.text.DecimalFormat;
import java.util.Scanner;

public class DiagonalPrincipal {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.0");

        String operacao = scanner.next();
        int N = scanner.nextInt();
        
        int[][] matriz = new int[N][N];
        double soma = 0;
        double media;
        int num = 0;
        int cont = 0;

        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                
                matriz[i][j] = scanner.nextInt();   
            }
        }

        if("S".equals(operacao)){
            
            for(int i=0; i<N; i++){
                for(int j=0; j<N; j++){
                    if(i == j){
                        soma =  soma + matriz[i][j];
                    }
                }
            }
            System.out.printf("%.1f\n", soma);
        }
        else if("M".equals(operacao)){
            
            for(int i=0; i<N; i++){
                for(int j=0; j<N; j++){
                    if(i == j){
                        num = num + matriz[i][j];
                        cont++;
                    }
                }
            }
            media = (double)num/cont;
            System.out.printf("%.1f\n", media);
        }

    }

}
