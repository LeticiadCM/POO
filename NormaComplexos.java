
import java.util.Scanner;

public class NormaComplexos {

    private int real;
    private int imaginario;

    public NormaComplexos(int real, int imaginario){
        this.real = real;
        this.imaginario = imaginario;
    }

    public NormaComplexos norma(NormaComplexos outro){
        int soma = this.real * outro.real + this.imaginario * outro.imaginario;

    }

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        while(scanner.hasNext()){

            int real = scanner.nextInt();
            String imag = scanner.next();
            int imaginario = Integer.parseInt(imag.replace("i", ""));

            NormaComplexos Z = new NormaComplexos(real, imaginario);
            NormaComplexos resultado = null;

            resultado = Z.norma(Z);

            System.out.print(resultado);

        }
    }
    
}
