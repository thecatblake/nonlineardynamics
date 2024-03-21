//
// Created by ryousuke kaga on 2024/03/21.
//

#include "iostream"
#include <boost/multiprecision/integer.hpp>

using namespace std;
using namespace boost::multiprecision;

int main() {
    unsigned long T = 350;
    unsigned long t;

    int1024_t x("998123456789");
    for (t = 0; t < T; t++) {
        if((x%2) == 0) x = x / 2;
        else x = 3 * x + 1;
        cout << to_string(x) << endl;
    }
}