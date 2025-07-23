
import java.util.Scanner;

public class PilhaInt {

    private int[] pilhaInt;
    private int topo;
    private int tamanho;

    public PilhaInt(int tamanho){
        this.tamanho = tamanho;
        this.topo = -1;
        this.pilhaInt = new int[tamanho];
    }

    public void empilha(int valor){
        if(topo + 1 < tamanho){
            pilhaInt[++topo] = valor;
        }    
    }

    public void desempilha(){
        if(topo >= 0){
            topo--;
        }
    }

    public void exibeTopo(){
        if(topo >= 0){
            System.out.println(pilhaInt[topo]);
        }
    }

    public void exibeTB(){ //topo a base
        if(topo >= 0){ //precisei colocar isso, pq quando n tinha nada pra mostrar, pulava uma linha
            for(int i=topo; i>=0; i--){
                System.out.print(pilhaInt[i]);
                if(i > 0){
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public void exibeBT(){
        if(topo >= 0){ //precisei colocar isso, pq quando n tinha nada pra mostrar, pulava uma linha
            for(int i=0; i<=topo; i++){
                System.out.print(pilhaInt[i]);
                if(i < topo){
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        if(!scanner.hasNextInt()){
            return;
        }
        int N = scanner.nextInt();

        PilhaInt pilhaInt = new PilhaInt(N);

        while(scanner.hasNext()){

            String op = scanner.next();
            switch (op) {
                case "E":
                    int valor = scanner.nextInt();
                    pilhaInt.empilha(valor);
                    break;
                case "D":
                    pilhaInt.desempilha();
                    break;
                case "T":
                    pilhaInt.exibeTopo();
                    break;
                case "X":
                    pilhaInt.exibeTB();
                    break;
                case "B":
                    pilhaInt.exibeBT();
                    break;
            }

        }

    }
    
}
