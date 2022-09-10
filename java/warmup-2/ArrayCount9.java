/*
Given an array of ints, return the number of 9's in the array.


arrayCount9([1, 2, 9]) → 1
arrayCount9([1, 9, 9]) → 2
arrayCount9([1, 9, 9, 3, 9]) → 3
*/
public int arrayCount9(int[] nums) {
  List<Integer> numsList = Arrays.stream(nums)
    .boxed()
    .collect(Collectors.toList());
  return (int) numsList.stream()
    .filter(x -> x == 9)
    .count();
}