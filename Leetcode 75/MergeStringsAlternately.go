package main

import (
	"fmt"
)

func main() {
	var word1 string
	var word2 string
	fmt.Scan(&word1)
	fmt.Scan(&word2)
	fmt.Println(mergeAlternately(word1, word2))
}

func mergeAlternately(word1 string, word2 string) string {
	res := ""
	i := 0
	for i < len(word1) && i < len(word2) {
		res += string(word1[i]) + string(word2[i])
		i++
	}
	if i < len(word1) {
		res += string(word1[i:])
	}
	if i < len(word2) {
		res += string(word2[i:])
	}
	return res
}
