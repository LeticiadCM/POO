#include <iostream>
#include <cmath>
#include <iomanip>
#include <string>
#include <sstream> 

class NormaComplexo {
private:
    int x;
    int y;

public:
    NormaComplexo(int x, int y){
        this->x = x;
        this->y = y;
    }

    //sobrecarga
    operator float() const {
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
            NormaComplexo z(x, y);
            float norma = float(z);

            std::cout << std::fixed << std::setprecision(4) << norma << std::endl;
        }

    }

    return 0;

}