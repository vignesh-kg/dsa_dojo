package main

import "fmt"

func main() {
	var candies []int
	var n int
	fmt.Scan(&n)
	for i := 0; i < n; i++ {
		var candy int
		fmt.Scan(&candy)
		candies = append(candies, candy)
	}
	var maxCandy int
	fmt.Scan(&maxCandy)
	fmt.Println(kidsWithCandies(candies, maxCandy))
}

func kidsWithCandies(candies []int, maxCandy int) []bool {
	res := make([]bool, len(candies))
	max := 0
	for i, _ := range candies {
		if max < candies[i] {
			max = candies[i]
		}
		res[i] = false
	}
	for i, candy := range candies {
		if maxCandy+candy >= max {
			res[i] = true
		}
	}
	return res
}
