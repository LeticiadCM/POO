#include <iostream>
#include <vector>
#include <algorithm>
#include <string>

using namespace std;

class LESInt{

private:
    int tamanho;
    vector<int> lista;

public:

    LESInt(int tamanho){
        this->tamanho = tamanho;

    }

    void inserir(int valor){
        if((int)lista.size() >= tamanho){
            return;
        }
        auto it = lower_bound(lista.begin(), lista.end(), valor);
        \if(it == lista.end() || *it != valor){
            lista.insert(it, valor);
        }
    }

    void remover(int valor){
        auto it = lower_bound(lista.begin(), lista.end(), valor);
        if(it != lista.end() && *it == valor){
            lista.erase(it);
        }
    }

    void buscar(int valor){
        auto it = lower_bound(lista.begin(), lista.end(), valor);
        if(it != lista.end() && *it == valor){
            cout << "SIM" << endl;
        }
        else{
            cout << "NAO" << endl;
        }
    }

    void mostrar(){
        if(!lista.empty()){
            for(size_t i=0; i<lista.size(); i++){
                cout << lista[i];
                if(i<lista.size() - 1){
                    cout << " ";
                }
            }
            cout << endl;
        }
    }
};

int main(){

    int N;
    cin >> N;

    LESInt lesInt(N);

    string op;

    while(cin >> op){
        if(op == "M"){
            lesInt.mostrar();
        } else {
            int valor;
            if (!(cin >> valor)) continue;
            if (valor <= 0) continue;
            if (op == "I") {
                lesInt.inserir(valor);
            } else if (op == "R") {
                lesInt.remover(valor);
            } else if (op == "B") {
                lesInt.buscar(valor);
            }
        }
    }

    return 0;
}