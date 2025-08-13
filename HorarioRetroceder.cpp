#include <iostream>
#include <iomanip>
#include <string>

using namespace std;

class HorarioRetroceder {
private:
    int hora;
    int minuto;
    int segundo;

public:
    HorarioRetroceder(int h, int m, int s){
        hora = h;
        minuto = m;
        segundo = s;
    }

    void retrocederSegundo(){

        if(segundo > 0){
            segundo--;
        }
        else if(segundo == 0){
            segundo = 59;
            if(minuto > 0){
                minuto--;
            }
            else if(minuto == 0){
                minuto = 59;
                if(hora > 0){
                    hora--;
                }
                else if(hora == 0){
                    hora = 23;
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
        
        HorarioRetroceder horario(h, m, s);
        horario.retrocederSegundo();

        cout << horario.toString() << endl;
    }
    return 0;
}