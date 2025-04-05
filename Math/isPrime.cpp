#include <bits/stdc++.h>
using namespace std;

bool isPrime(int x) {
    bool flag = true;

    for (int i = 2; i < x; i++) {
        if (x % i == 0) flag = false;
    }
    return flag;
}

int main() {

    isPrime(69) ? cout<<"Yes" : cout<<"No";

    return 0;
}
