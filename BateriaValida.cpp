#include <iostream>
#include <string>

using namespace std;

class BateriaValida {
private:
    int carga;

public:
    BateriaValida(int c){
        carga = c;
    }

    bool Valida(){
        return carga >= 0 && carga <= 100;
    }

    string checkCarga(){
        return Valida() ? "bateria valida" : "bateria invalida";
    }
};

int main(){

    string entrada;

    while(getline(cin, entrada)){

        size_t percentPos = entrada.find("%");
        
        if(percentPos != string::npos){
            entrada = entrada.substr(0, percentPos);
        }

        try{
            int carga = stoi(entrada);
            BateriaValida bateria(carga);
            cout << bateria.checkCarga() << endl;
        } catch(...){
            cout << "bateria invalida" << endl;
        }
    }

    return 0;

}