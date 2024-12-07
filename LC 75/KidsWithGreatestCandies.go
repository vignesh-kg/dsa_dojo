package main

import "fmt"

func main() {
	fmt.Println(kidsWithCandies([]int{2, 3, 5, 1, 3}, 3))
}

func kidsWithCandies(candies []int, extraCandies int) []bool {
	res := make([]bool, len(candies))
	maxCandy := 0
	for _, candy := range candies {
		if maxCandy < candy {
			maxCandy = candy
		}
	}
	for i, candy := range candies {
		if maxCandy <= candy+extraCandies {
			res[i] = true
		}
	}
	return res
}
