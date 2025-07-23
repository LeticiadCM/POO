#include <iostream>

using namespace std;

int main() {
    int notas[] = {2, 5, 10, 20, 50, 100};
    int N, M;

    while (true) {
        cin >> N >> M;

        if (N == 0 && M == 0) {
            break;
        }

        int troco = M - N;
        bool possible = false;

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (i != j && notas[i] + notas[j] == troco) {
                    possible = true;
                    break;
                }
            }
            if (possible){
                break;
            } 
        }

        if (possible) {
            cout << "possible";
        } else {
            cout << "impossible";
        }
    }

    return 0;
}
