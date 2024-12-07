package main

import (
	"fmt"
)

func main() {
	fmt.Println(canPlaceFlowers([]int{1, 0, 0, 0, 1}, 1))
	fmt.Println(canPlaceFlowers([]int{1, 0, 0, 0, 1}, 2))
}

func canPlaceFlowers(flowerbed []int, n int) bool {
	if n == 0 {
		return true
	}

	for i, _ := range flowerbed {
		if (i == 0 || flowerbed[i-1] == 0) && flowerbed[i] == 0 && (i == len(flowerbed)-1 || flowerbed[i+1] == 0) {
			n--
			flowerbed[i] = 1
		}
		if n == 0 {
			return true
		}
	}
	return false
}
