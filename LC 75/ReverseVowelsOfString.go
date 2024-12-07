package main

import (
	"fmt"
)

func main() {
	fmt.Println(reverseVowels("Hello World"))
	fmt.Println(reverseVowels("Apple"))
}

func reverseVowels(s string) string {
	isVowel := func(ch rune) bool {
		switch ch {
		case 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U':
			return true
		default:
			return false
		}
	}
	i, j := 0, len(s)-1
	runes := []rune(s)
	for i < j {
		if isVowel(runes[i]) && isVowel(runes[j]) {
			runes[i], runes[j] = runes[j], runes[i]
			i++
			j--
		} else if isVowel(runes[i]) {
			j--
		} else if isVowel(runes[j]) {
			i++
		} else {
			i++
			j--
		}
	}
	return string(runes)
}
