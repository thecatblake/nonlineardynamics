//
// Created by ryousuke kaga on 2024/03/23.
//

#include <iostream>
#include <boost/multiprecision/integer.hpp>
#include <boost/rational.hpp>

using namespace std;
using namespace boost::multiprecision;
using namespace boost;

int main() {
    rational<int1024_t> x(1, 3);
    int T = 10;
    cout << "x[0] = " << x << endl;
    for (int t = 0; t < T; t++) {
        rational<int1024_t> one(1, 1);
        rational<int1024_t> four(4, 1);
        x = four * x * (one - x);

        cout << "x[" << t + 1 << "] = " << x << endl;
    }

    return 0;
}