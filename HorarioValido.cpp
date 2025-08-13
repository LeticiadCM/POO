#include <iostream>
#include <string>

using namespace std;

class HorarioValido {
private:
    int hora;
    int minuto;
    int segundo;

public:
    HorarioValido(int h, int m, int s){
        hora = h;
        minuto = m;
        segundo = s;
    }

    bool ehValido() const {
        return (hora >= 0 && hora <= 23) &&
               (minuto >= 0 && minuto <= 59) &&
               (segundo >= 0 && segundo <= 59);
    }
};

int main() {
    string entrada;
    
    while (getline(cin, entrada)) {
        // Vamos extrair os valores diretamente
        size_t pos1 = entrada.find(':');
        size_t pos2 = entrada.find(':', pos1 + 1);
        
        // Verifica se encontrou os dois delimitadores
        if (pos1 == string::npos || pos2 == string::npos) {
            cout << "horario invalido" << endl << endl;
            continue;
        }
        
        try {
            int h = stoi(entrada.substr(0, pos1));
            int m = stoi(entrada.substr(pos1 + 1, pos2 - (pos1 + 1)));
            int s = stoi(entrada.substr(pos2 + 1));
            
            HorarioValido horario(h, m, s);
            
            if (horario.ehValido()) {
                cout << "horario valido" << endl;
            } else {
                cout << "horario invalido" << endl;
            }
        } catch (...) {
            cout << "horario invalido" << endl;
        }     
    }
    
    return 0;
}