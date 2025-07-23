import java.util.*;

public class LESInt {

    private int tamanho;
    private List<Integer> lista;

    public LESInt(int tamanho){
        //construtor serve para inicializar os atributos da classe
        this.tamanho = tamanho;
        this.lista = new ArrayList<>();
    }

    public void inserir(int valor){
        if(lista.size() >= tamanho){
            return;
        }
        int pos = Collections.binarySearch(lista, valor); //retorna <0 se valor n estiver na lista
        if(pos < 0){
           lista.add(-pos-1, valor); 
        }

    }

    public void remover(int valor){
        int pos = Collections.binarySearch(lista, valor);
        if(pos >= 0){
            lista.remove(pos);
        }
    }

    public void buscar(int valor){
        int pos = Collections.binarySearch(lista, valor);
        if(pos >= 0){
            System.out.println("SIM");
        }
        else if(pos < 0){
            System.out.println("NAO");
        }
    }

    public void mostrar(){
        if(!lista.isEmpty()){ //precisei colocar isso, pq quando n tinha nada pra mostrar, pulava uma linha
            for(int i=0; i<lista.size(); i++){
                System.out.print(lista.get(i));
                if(i < lista.size() - 1){
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (!scanner.hasNextLine()){
            return;
        }

        int N = scanner.nextInt();

        if (N <= 0 || N>30000){
            return;
        }
        
        LESInt lesInt = new LESInt(N);

        while (scanner.hasNext()) {
            String comando = scanner.next();
            if (comando.equals("M")) {
                lesInt.mostrar();

            } else if (scanner.hasNextInt()) {
                int valor = scanner.nextInt();
                if (valor <= 0) continue;
                switch (comando) {
                    case "I":
                        lesInt.inserir(valor);
                        break;
                    case "R":
                        lesInt.remover(valor);
                        break;
                    case "B":
                        lesInt.buscar(valor);
                        break;
                    default:
                        break;
                }
            } else{
                scanner.next();
            }
        }


    }
    
}
