#include <iostream>

class Complexo{

private:
    int x;
    int y;

public:
    //inicializando variaveis
    Complexo() : x(0), y(0) {}

    //sobrecarga
    Complexo& operator=(int k){
        x = k;
        y = 0;
        return *this;
    }

    void exibir() const {
        std::cout << x << "+" << y << "i" << std::endl;
    }
};

int main(){

    Complexo c;
    int k;

    while(std::cin >> k){
        c = k;
        c.exibir();
    }

    return 0;
}