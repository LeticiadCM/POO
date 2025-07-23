
import java.util.Scanner;

public class PilhaDinamica {

    private class No{
        int valor;
        No proximo;

        No(int valor){
            this.valor = valor;
            this.proximo = null;
        }
    }

    private No topo;

    public PilhaDinamica(){
        topo = null;
    }

    public void empilhar(int valor){

        No novo = new No(valor);
        novo.proximo = topo;
        topo = novo;

    }

    public void desempilhar(){

        if(topo != null){
            System.out.printf("[%s]\n", topo.valor);
            topo = topo.proximo;
        }
    }

    public void exibir(){

        No atual = topo;
        
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
        PilhaDinamica pilha = new PilhaDinamica();

        while(scanner.hasNext()){

            String op = scanner.next();
            switch (op) {
                case "E":
                    int valor = scanner.nextInt();
                    pilha.empilhar(valor);
                    break;
                case "D":
                    pilha.desempilhar();
                    break;
                case "M":
                    pilha.exibir();
                    break;
            }

        }

    }
    
}
