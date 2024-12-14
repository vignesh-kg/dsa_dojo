package main

import "fmt"

func productExceptSelf(nums []int) []int {
	result := make([]int, len(nums))
	result[0] = 1
	for i := 1; i < len(nums); i++ {
		result[i] = result[i-1] * nums[i-1]
	}
	temp := 1
	for i := len(nums) - 1; i >= 0; i-- {
		result[i] *= temp
		temp *= nums[i]
	}
	return result
}

func main() {
	nums := []int{1, 2, 3, 4}
	fmt.Println(productExceptSelf(nums))
}
