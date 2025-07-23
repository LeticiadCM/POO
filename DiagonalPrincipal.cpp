#include <iostream>
#include <iomanip>
#include <vector>
using namespace std;

int main() {
    char operacao;
    int N;

    cin >> operacao;
    cin >> N;

    vector<vector<int>> matriz(N, vector<int>(N));

    // Lê a matriz
    for (int i = 0; i < N; i++) {
        for (int j = 0; j < N; j++) {
            cin >> matriz[i][j];
        }
    }

    double soma = 0.0;
    int cont = 0;

    // Processa a diagonal principal
    for (int i = 0; i < N; i++) {
        soma += matriz[i][i];
        cont++;
    }

    cout << fixed << setprecision(1);

    if (operacao == 'S') {
        cout << soma << endl;
    } else if (operacao == 'M') {
        cout << (soma / cont) << endl;
    }

    return 0;
}
