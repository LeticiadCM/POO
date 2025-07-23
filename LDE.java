
import java.util.Scanner;

public class LDE {

    private class No{
        int valor;
        No proximo;

        No(int valor){
            this.valor = valor;
            this.proximo = null;
        }
    }
    
    private No inicio;

    public LDE(){
        this.inicio = null;
    }

    private boolean contem(int valor){
        No atual = inicio;
        while(atual != null){
            if(atual.valor == valor){
                return true;
            }
            atual = atual.proximo;
        }
        return false;
    }

    public void inserir(int valor){

        if(contem(valor)){
            return;
        }

        No novo = new No(valor);

        if(inicio == null || valor < inicio.valor){
            // coloca no inicio
            novo.proximo = inicio;
            inicio = novo;
            return;
        }

        No atual = inicio;
        while(atual.proximo != null && atual.proximo.valor < valor){
            atual = atual.proximo;
        }

        novo.proximo = atual.proximo;
        atual.proximo = novo;
        
    }

    public void excluir(int valor){

        if(inicio == null){
            return;
        }

        if(inicio.valor == valor){
            inicio = inicio.proximo;
            return;
        }

        No atual = inicio;
        while(atual.proximo != null){
            if(atual.proximo.valor == valor){
                atual.proximo = atual.proximo.proximo;
                return;
            }
            atual = atual.proximo;
        }
    }

    public void buscar(int valor){
        if(contem(valor)){
            System.out.println("SIM");
        }
        else{
            System.out.println("NAO");
        }
    }

    public void listar(){
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

        LDE lde = new LDE();

        while(scanner.hasNext()){

            String op = scanner.next();

            switch (op) {
                case "I":
                    int valor = scanner.nextInt();
                    lde.inserir(valor);
                    break;
                case "R":
                    valor = scanner.nextInt();
                    lde.excluir(valor);
                    break;
                case "B":
                    valor = scanner.nextInt();
                    lde.buscar(valor);
                    break;
                case "L":
                    lde.listar();
                    break;
            }

        }

    }


}
