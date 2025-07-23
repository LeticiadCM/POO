
import java.util.*;

public class Fila {

    private int[] fila;
    private int tamanho;
    private int inicio; //retira
    private int fim; //insere

    //fila tem tamanho, inicio e fim
    public Fila(int tamanho){
        this.fila = new int[tamanho];  
        this.tamanho = tamanho;
        this.inicio = 0;
        this.fim = 0;            
    }

    public void inserir(int valor){
        if(fim - inicio < tamanho){
            if(fim < tamanho){
                fila[fim++] = valor;
            }
        }
    }

    public void retirar(){
        if(inicio != fim){
            System.out.println(fila[inicio++]);
            if(inicio == fim){
                inicio = 0;
                fim = 0;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        Fila fila = new Fila(N);

        while(scanner.hasNext()){
            String op = scanner.next();
            if("E".equals(op)){
                int valor = scanner.nextInt();
                fila.inserir(valor);
            }
            else if("D".equals(op)){
                fila.retirar();
                }
        }
    }
    
}
