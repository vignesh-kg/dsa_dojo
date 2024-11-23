package main

import "fmt"

func main() {
	var n int
	fmt.Scan(&n)
	var flowerBed []int
	for i := 0; i < n; i++ {
		var num int
		fmt.Scan(&num)
		flowerBed = append(flowerBed, num)
	}
	var flower int
	fmt.Scan(&flower)
	fmt.Println(canPlaceFlowers(flowerBed, flower))
}

func canPlaceFlowers(flowerBed []int, flowers int) bool {
	for i := 0; i < len(flowerBed); i++ {
		if (i == 0 || flowerBed[i-1] == 0) && flowerBed[i] == 0 && (i == len(flowerBed)-1 || flowerBed[i+1] == 0) {
			flowerBed[i] = 1
			flowers--
		}
	}
	return flowers <= 0
}
