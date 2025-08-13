#include <iostream>
#include <string>

using namespace std;

class RecarregarBateria{
private:
    int carga;

public:

    RecarregarBateria(int c){
        carga = c;
    }

    void addBateria(){
        if (carga < 100) {
            carga++;
        }
        else if(carga == 100){
            carga;
        }
    }

    string toString(){
        return to_string(carga) + "%";
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
            RecarregarBateria bateria(carga);
            bateria.addBateria();

            cout << bateria.toString() << endl;
        } catch(...){
            cout  << "entrada invalida" << endl;
        }
    }
    return 0;
}