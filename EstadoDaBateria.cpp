#include <iostream>
#include <string>

using namespace std;

class EstadoDaBateria{
private:
    int carga;

public:

    EstadoDaBateria(int c){
        carga = c;
    }

    string estadoBateria(){
        if (carga == 0) {
            return "0%: bateria vazia.";
        } else if (carga >= 1 && carga <= 5) {
            return to_string(carga) + "%: bateria quase vazia.";
        } else if (carga >= 95 && carga <= 99) {
            return to_string(carga) + "%: bateria quase cheia.";
        } else if (carga == 100) {
            return "100%: bateria cheia.";
        } else {
            return to_string(carga) + "%: " + string(carga, '|');
        }
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
            EstadoDaBateria bateria(carga);

            cout << bateria.estadoBateria() << endl;
        } catch(...){
            cout  << "entrada invalida" << endl;
        }
    }
    return 0;
}