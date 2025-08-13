#include <iostream>
#include <string>

using namespace std;

class Relogio{

protected:
    int hora, minuto, segundo;

public:

    Relogio(){ //inicializa com zero
        hora = 0;
        minuto = 0;
        segundo = 0;
    }

    virtual void tic(){
        segundo++;
        if(segundo == 60){
            segundo = 0;
            tac();
        }
    }

    virtual void tac(){
        minuto++;
        if(minuto == 60){
            minuto = 0;
            toc();
        }
    }

    virtual void toc(){
        hora++;
        if(hora == 24){
            hora = 0;
        }
    }

    virtual void mostrar(){

        cout << hora << ":" << minuto << ":" << segundo << endl;
    }
};

class Incremento{

public:
    virtual void incrementar(Relogio &r) = 0;
    virtual ~Incremento(){}
};

class IncrementoSegundo: public Incremento{
public:
    void incrementar(Relogio &r) override{
        r.tic();
    }
};

class IncrementoMinuto: public Incremento{
public:
    void incrementar(Relogio &r) override{
        r.tac();
    }
};

class IncrementoHora: public Incremento{
public:
    void incrementar(Relogio &r) override{
        r.toc();
    }
};

int main(){

    string entrada;
    Relogio r;

    IncrementoSegundo incSeg;
    IncrementoMinuto incMin;
    IncrementoHora incHora;

    while(getline(cin, entrada)){
        Incremento* inc = nullptr;

        if(entrada == "tic"){
            inc = &incSeg;
        }
        else if(entrada == "tac"){
            inc = &incMin;
        }
        else if(entrada == "toc"){
            inc = &incHora;
        } else{
            continue;
        }

        inc->incrementar(r);
    }

    r.mostrar();

    return 0;
}