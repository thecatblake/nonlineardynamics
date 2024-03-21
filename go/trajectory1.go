package main

import (
	"fmt"
	"math/big"
)

func main() {
	x, _ := new(big.Int).SetString("99123456789", 10)
	zero := big.NewInt(0)
	one := big.NewInt(1)
	two := big.NewInt(2)
	three := big.NewInt(3)
	T := 350

	for t := 0; t < T; t++ {
		div := new(big.Int)
		if div.Mod(x, two).Cmp(zero) == 0 {
			x = x.Div(x, two)
		} else {
			x = x.Mul(x, three)
			x = x.Add(x, one)
		}

		fmt.Println(x)
	}
}
