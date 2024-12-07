package main

import (
	"fmt"
	"strings"
)

func main() {
	fmt.Println(reverseWords("This is a Great World"))
	fmt.Println(reverseWords("   In a World of   White Spaces   "))
}

func reverseWords(s string) string {
	words := strings.Fields(s)
	low, high := 0, len(words)-1
	for low < high {
		words[low], words[high] = words[high], words[low]
		low++
		high--
	}
	return strings.TrimSpace(strings.Join(words, " "))
}
