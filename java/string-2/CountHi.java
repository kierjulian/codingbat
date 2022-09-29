/*
Return the number of times that the string "hi" appears anywhere in the given string.


countHi("abc hi ho") → 1
countHi("ABChi hi") → 2
countHi("hihi") → 2
*/
public int countHi(String str) {
  return (str.length() - str.replace("hi", "").length()) / 2;
}