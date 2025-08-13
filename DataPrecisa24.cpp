#include <iostream>
#include <string>

using namespace std;

class DataPrecisa24{
    
private:
    int hora, minuto, segundo;
    int dia, mes, ano;

public:

    DataPrecisa24(int h, int m, int s, int d, int mt, int a){
        hora = h;
        minuto = m;
        segundo = s;
        dia = d;
        mes = mt;
        ano = a;
    }

    void incrementarSeg(int segundos){
        segundo += segundos;
    }

    string toString(){
        string horaExt;
        string minExt;
        string segExt;
        string diaExt;
        string mesExt;
        string anoExt;

    }
};

int main(){

    int dia, mes, ano, hora, minuto, segundo;
    cin >> dia >> mes >> ano >> hora >> minuto >> segundo;

    string incremento;
    cin >> incremento;

    int totalInc = incremento.size();

    DataPrecisa24 dataprecisa(dia, mes, ano, hora, minuto, segundo);

    dataprecisa.incrementarSeg(totalInc);

    cout << dataprecisa.toString();

    return 0;

}