package main

import (
	"fmt"
)

func main() {
	fmt.Println(mergeAlternately("abc", "pqrs"))
}

func mergeAlternately(word1, word2 string) string {
	i := 0
	result := ""
	for i < len(word1) && i < len(word2) {
		result += string(word1[i]) + string(word2[i])
		i++
	}

	if i < len(word1) {
		result += word1[i:]
	} else if i < len(word2) {
		result += word2[i:]
	}
	return result
}
