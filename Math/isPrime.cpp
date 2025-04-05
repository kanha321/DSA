#include <bits/stdc++.h>
using namespace std;

bool isPrime(int x) {
    bool flag = true;

    for (int i = 2; i < x; i++) {
        if (x % i == 0) flag = false;
    }
    return flag && x > 1;
}

int main() {

    isPrime(0) ? cout<<"Yes" : cout<<"No";

    return 0;
}
