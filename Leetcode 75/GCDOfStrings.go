package main

import "fmt"

func main() {
	var str1 string
	var str2 string
	fmt.Scan(&str1, &str2)
	fmt.Println(gcdOfStrings(str1, str2))
}

func gcdOfStrings(str1 string, str2 string) string {
	if str1+str2 != str2+str1 {
		return ""
	}
	var gcd func(a int, b int) int
	gcd = func(a int, b int) int {
		if b == 0 {
			return a
		}
		return gcd(b, a%b)
	}
	return str1[:gcd(len(str1), len(str2))]
}
