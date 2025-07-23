
import java.util.Scanner;

public class FilaDinamica {

    private class No{
        int valor;
        No proximo;

        No(int valor){
            this.valor = valor;
            this.proximo = null;
        }
    }

    private No inicio;
    private No fim;

    public FilaDinamica(){
        this.inicio = null;
        this.fim = null;
    }

    public void inserir(int valor){

        No novo = new No(valor);

        if(inicio == null){
            inicio = novo;
            fim = novo;
        }
        else{
            fim.proximo = novo;
            fim = novo;
        }
    }

    public void excluir(){

        if(inicio != null){
            System.out.printf("<%s>\n", inicio.valor);
            inicio = inicio.proximo;
            if(inicio == null){
                fim = null;
            }
        }
    }

    public void exibir(){

        No atual = inicio;
        if(atual == null){
            return;
        }

        while(atual != null){
            System.out.print(atual.valor);
            if(atual.proximo != null){
                System.out.print(" ");
            }
            atual = atual.proximo;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        FilaDinamica fila = new FilaDinamica();

        while(scanner.hasNext()){

            String op = scanner.next();
            switch (op) {
                case "E":
                    int valor = scanner.nextInt();
                    fila.inserir(valor);
                    break;
                case "D":
                    fila.excluir();
                    break;
                case "M":
                    fila.exibir();
                    break;
            }

        }

    }


}
