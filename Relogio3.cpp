#include <iostream>
#include <string>

using namespace std;

class Relogio{

protected:
    int hora, minuto, segundo;

public:

    Relogio(int h, int m, int s){
        hora = h;
        minuto = m;
        segundo = s;
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

    IncrementoSegundo incSeg;
    IncrementoMinuto incMin;
    IncrementoHora incHora;

    int hora, minuto, segundo;

    cin >> hora >> minuto >> segundo;

    Relogio r(hora, minuto, segundo);

    while(getline(cin, entrada)){
        Incremento *inc = nullptr;

        if(entrada == "tic"){
            inc = &incSeg;
        }
        else if(entrada == "tac"){
            inc = &incMin;
        }
        else if(entrada == "toc"){
            inc = &incHora;
        }
        else{
            continue;
        }

        inc -> incrementar(r);
    }

    r.mostrar();
    return 0;
}