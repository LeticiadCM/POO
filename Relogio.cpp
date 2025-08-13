#include <iostream>
#include <string>

using namespace std;

//base
class Tempo{

protected:
    int hora, minuto, segundo;

public:

    Tempo(){ //inicializa com zero
        hora = 0;
        minuto = 0;
        segundo = 0;
    }

    virtual void add(){
        segundo++;
        if(segundo == 60){
            segundo = 0;
            minuto++;
        }

        if(minuto == 60){
            minuto = 0;
            hora++;
        }

        if(hora == 24){
            hora = 0;
            minuto = 0;
            segundo = 0;
        }
    }

    virtual void mostrar(){

        cout << hora << ":" << minuto << ":" << segundo << endl;
    }
};

//derivada
class Relogio: public Tempo{

public:
    void tic(){
        add();
    }
};

int main(){

    string entrada;
    Relogio relogio;

    while(getline(cin, entrada)){
        if(entrada == "tic"){
            relogio.tic();
        }
    }

    relogio.mostrar();
    return 0;
}