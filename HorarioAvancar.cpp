#include <iostream>
#include <iomanip>
#include <string>

using namespace std;

class HorarioAvancar {
private:
    int hora;
    int minuto;
    int segundo;

public:
    HorarioAvancar(int h, int m, int s){
        hora = h;
        minuto = m;
        segundo = s;
    }

    void avancarSegundo(){

        if(segundo < 59){
            segundo++;
        }
        else if(segundo == 59){
            segundo = 0;
            if(minuto < 59){
                minuto++;
            }
            else if(minuto == 59){
                minuto = 0;
                if(hora < 23){
                    hora++;
                }
                else if(hora == 23){
                    hora = 0;
                }
            }
        }
    }
    string toString() const{
        stringstream ss;

        ss << setw(2) << setfill('0') << hora << ":"
           << setw(2) << setfill('0') << minuto << ":"
           << setw(2) << setfill('0') << segundo;
        return ss.str();
    }
};

int main() {
    string entrada;
    
    while (getline(cin, entrada)) {
        // Vamos extrair os valores diretamente
        size_t pos1 = entrada.find(':');
        size_t pos2 = entrada.find(':', pos1 + 1);
        
        int h = stoi(entrada.substr(0, pos1));
        int m = stoi(entrada.substr(pos1 + 1, pos2 - (pos1 + 1)));
        int s = stoi(entrada.substr(pos2 + 1));
        
        HorarioAvancar horario(h, m, s);
        horario.avancarSegundo();

        cout << horario.toString() << endl;
    }
    return 0;
}