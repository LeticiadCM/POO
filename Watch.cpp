#include <iostream>
#include <string>

using namespace std;

class Cronometro{

private:
    int hora, minuto, segundo;

public:

    Cronometro(){ //inicializa com zero
        hora = 0;
        minuto = 0;
        segundo = 0;
    }

    void tic(){
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

    void mostrar(){

        cout << hora << ":" << minuto << ":" << segundo << endl;
    }
};

int main(){

    string entrada;
    Cronometro cronometro;

    while(getline(cin, entrada)){
        if(entrada == "tic"){
            cronometro.tic();
        }
    }

    cronometro.mostrar();
    return 0;
}