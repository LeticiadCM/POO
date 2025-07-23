#include <iostream>
#include <vector>
#include <string>

using namespace std;

class Fila{

private:
    vector<int> fila;
    int tamanho;
    int inicio;
    int fim;
    
public:
    Fila(int tamanho){
        this->fila.resize(tamanho);
        this->tamanho = tamanho;
        this->inicio = 0;
        this->fim = 0;
    }

    void inserir(int valor) {
        if(fim - inicio < tamanho){ //nao ta vazia
            if(fim < tamanho){ //nao ta cheia
                fila[fim++] = valor;
            }
        }
    }

    void retirar() {
        if(inicio != fim){
            cout << fila[inicio++] << endl;
            if(inicio == fim){
                inicio = 0;
                fim = 0;
            }
        }
    }

};

int main(){

    int tamanho;
    cin >> tamanho;
    
    Fila fila(tamanho);

    string op;

    while(cin >> op){

        if(op == "E"){
            int valor;
            cin >> valor;
            fila.inserir(valor);
        }
        else if (op == "D"){
            fila.retirar();
        }  
    }

    return 0;
}