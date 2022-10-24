/*
Return true if the string "cat" and "dog" appear the same number of times in the given string.


catDog("catdog") → true
catDog("catcat") → false
catDog("1cat1cadodog") → true
*/
public boolean catDog(String str) {
  int catTotal = (str.length() - str.replaceAll("cat", "").length()) / 3;
  int dogTotal = (str.length() - str.replaceAll("dog", "").length()) / 3;
  return catTotal == dogTotal;
}