#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

int main() {
    int soma_s = 0;
    int soma_i = 0;
    int N;

    cin >> N;
    vector<int> idades(N);

    for (int i = 0; i < N; i++) {
        cin >> idades[i];
    }

    if (N == 1) {
        cout << "S" << endl << endl;
    } else {
        sort(idades.begin(), idades.end());

        for (int i = 0; i < N - 1; i++) {
            int dif = idades[i + 1] - idades[i];

            if (dif == 1 || dif == 0) {
                soma_s++;
            } else if (dif > 1) {
                soma_i++;
            }
        }

        if (soma_s >= 1) {
            if (soma_s == N - 1) {
                cout << "S" << endl << endl;
            } else {
                cout << "N" << endl << endl;
            }
        } else {
            if (soma_i == N - 1) {
                cout << "S" << endl << endl;
            } else {
                cout << "N" << endl << endl;
            }
        }
    }

    return 0;
}
