package main

import (
	"fmt"
	"slices"
)

func main() {
	intervals := [][]int{
		{1, 2},
		{2, 3},
		{3, 4},
		{1, 3}}
	fmt.Println(eraseOverlapIntervals(intervals))
}

func eraseOverlapIntervals(intervals [][]int) int {
	// Sort the intervals based on their ending time
	slices.SortFunc(intervals, func(a, b []int) int {
		return a[1] - b[1]
	})
	noOfOverlappingIntervals := 0
	prevEnd := intervals[0][1]
	for i := 1; i < len(intervals); i++ {
		if prevEnd > intervals[i][0] {
			noOfOverlappingIntervals++
			if prevEnd > intervals[i][1] {
				prevEnd = intervals[i][1]
			}
		} else {
			prevEnd = intervals[i][1]
		}
	}
	return noOfOverlappingIntervals
}
