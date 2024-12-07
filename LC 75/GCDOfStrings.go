package main

import (
	"fmt"
)

func main() {
	fmt.Println(gcdOfStrings("ABABAB", "AB"))
	fmt.Println(gcdOfStrings("LEET", "CODE"))
	fmt.Println(gcdOfStrings("ABCABC", "ABC"))
}

func gcdOfStrings(str1, str2 string) string {
	if str1+str2 != str2+str1 {
		return ""
	}
	var gcd func(len1, len2 int) int
	gcd = func(len1, len2 int) int {
		if len2 == 0 {
			return len1
		}
		return gcd(len2, len1%len2)
	}
	return str1[:gcd(len(str1), len(str2))]
}
