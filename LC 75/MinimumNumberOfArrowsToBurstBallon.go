package main

import (
	"fmt"
	"slices"
)

func main() {
	points := [][]int{
		{10, 16},
		{2, 8},
		{1, 6},
		{7, 12},
	}
	fmt.Println(findMinArrowShots(points))
	points = [][]int{
		{1, 2},
		{3, 4},
		{5, 6},
		{7, 8},
	}
	fmt.Println(findMinArrowShots(points))
	points = [][]int{
		{1, 2},
		{2, 3},
		{3, 4},
		{4, 5},
	}
	fmt.Println(findMinArrowShots(points))
}

func findMinArrowShots(points [][]int) int {
	slices.SortFunc(points, func(a, b []int) int {
		return a[1] - b[1]
	})

	minArrowsRequired := len(points)
	prevEnd := points[0][1]
	for i := 1; i < len(points); i++ {
		if prevEnd >= points[i][0] {
			minArrowsRequired--
			if prevEnd > points[i][1] {
				prevEnd = points[i][1]
			}
		} else {
			prevEnd = points[i][1]
		}
	}
	return minArrowsRequired
}
