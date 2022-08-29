/*
Given 2 positive int values, return the larger value that is in the range 10..20 inclusive, or return 0 if neither is in that range.


max1020(11, 19) → 19
max1020(19, 11) → 19
max1020(11, 9) → 11
*/
public int max1020(int a, int b) {
  int first = 10 <= a && a <= 20 ? a : 0;
  int second = 10 <= b && b <= 20 ? b : 0;
  return Math.max(first, second);
}