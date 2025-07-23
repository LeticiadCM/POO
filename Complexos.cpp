#include <iostream>
using namespace std;

class Complexo {
private:
    int real;
    int imaginario;

public:
    Complexo(int r=0; int i=0){
        real = r;
        imaginario = i;
    }

    Complexo operator+(const Complexo& c) const {
        return Complexo(real + c.real, imaginario + c.imaginario);
    }

    Complexo operator-(const Complexo& c) const {
        return Complexo(real - c.real, imaginario - c.imaginario);
    }

    Complexo operator*(const Complexo& c) const {
        int r = real * c.real - imaginario * c.imaginario;
        int i = real * c.imaginario + imaginario * c.real;
        return Complexo(r, i);
    }

    Complexo operator/(const Complexo& c) const {
        int denominador = c.real * c.real + c.imaginario * c.imaginario;
        int r = (real * c.real + imaginario * c.imaginario) / denominador;
        int i = (imaginario * c.real - real * c.imaginario) / denominador;
        return Complexo(r, i);
    }

    void exibir() const {
        cout << real << "+" << imaginario << "i" << endl;
    }
};

int main(){
    int a, b, c, d;
    char op;

    while (cin >> a >> b >> op >> c >> d) {
        Complexo z1(a, b);
        Complexo z2(c, d);
        Complexo resultado;

        switch (op) {
            case '+':
                resultado = z1 + z2;
                break;
            case '-':
                resultado = z1 - z2;
                break;
            case '*':
                resultado = z1 * z2;
                break;
            case '/':
                resultado = z1 / z2;
                break;
        }

        resultado.exibir();
    }
    return 0;
}