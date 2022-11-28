/*
Given an array of ints length 3, return the sum of all the elements.


sum3([1, 2, 3]) → 6
sum3([5, 11, 2]) → 18
sum3([7, 0, 0]) → 7
*/
public int sum3(int[] nums) {
  return Arrays.stream(nums)
    .boxed()
    .mapToInt(num -> num)
    .sum();
}