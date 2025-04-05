#include<bits/stdc++.h>
using namespace std;

vector<int> allDivisors (int x) {

    vector<int> divisors;

    for (int i = 2; i < x; i++) 
        if (x % i == 0) divisors.push_back(i);

    return divisors;
}

int main () {

    vector<int> divisors = allDivisors(100);

    for (int i = 0; i < divisors.size(); i++) {
        cout << divisors.at(i) << endl;
    }

    return 0;
}
