#include <iostream>
#include <string>

using namespace std;

class HorarioExtenso {
private:
    int hora;
    int minuto;
    int segundo;

    string formatarComponente(int valor, const string& singular, const string& plural) const {
        if (valor == 1) {
            return "1 " + singular;
        } else if (valor > 1) {
            return to_string(valor) + " " + plural;
        }
        return "";
    }

public:
    HorarioExtenso(int h, int m, int s) : hora(h), minuto(m), segundo(s) {}

    string toString() const {
        string horaExtenso;
        string minExtenso;
        string segExtenso;

        if(hora == 0 && minuto == 0 && segundo == 0){
            return "meia-noite.";
        }
        if(hora == 12 && minuto == 0 && segundo == 0){
            return "meio-dia.";
        }

        if(hora == 0){
            horaExtenso = "meia-noite";
        } else if (hora == 12) {
            horaExtenso = "meio-dia";
        } else {
            horaExtenso = formatarComponente(hora, "hora", "horas");
        }

        minExtenso = formatarComponente(minuto, "minuto", "minutos");
        segExtenso = formatarComponente(segundo, "segundo", "segundos");

        string resultado;
        bool temHora = !horaExtenso.empty();
        bool temMin = !minExtenso.empty();
        bool temSeg = !segExtenso.empty();

        if (temHora) resultado += horaExtenso;
        if (temMin) {
            if (temHora) {
                resultado += temSeg ? ", " : " e ";
            }
            resultado += minExtenso;
        }
        if (temSeg) {
            if (temHora || temMin) {
                resultado += " e ";
            }
            resultado += segExtenso;
        }

        return resultado + ".";
    }
};

int main() {
    string entrada;
    
    while (getline(cin, entrada)) {
        size_t pos1 = entrada.find(':');
        size_t pos2 = entrada.find(':', pos1 + 1);
        
        int h = stoi(entrada.substr(0, pos1));
        int m = stoi(entrada.substr(pos1 + 1, pos2 - (pos1 + 1)));
        int s = stoi(entrada.substr(pos2 + 1));
        
        HorarioExtenso horario(h, m, s);
        cout << horario.toString() << endl;
    }
    
    return 0;
}