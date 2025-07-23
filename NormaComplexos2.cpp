#include <iostream>
#include <cmath>
#include <iomanip>
#include <string>
#include <sstream> 

class NormaComplexos2 {

private:
    int x;
    int y;

public:
    NormaComplexos2(int x, int y){
        this->x = x;
        this->y = y;
    }

    //sobrecarga
    operator double() const{
        return std::sqrt(x * x + y * y);
    }
};

int main(){

    std::string linha;

    while(std::getline(std::cin, linha)){

        std::istringstream iss(linha);
        int x, y;
        char i;

        while(iss >> x >> y >> i){
            NormaComplexos2 z(x, y);
            double norma = double(z);

            std::cout << std::fixed << std::setprecision(4) << norma << std::endl;
        }

    }

    return 0;
}
