/*
Given a list of integers, return a list where each integer is multiplied by 2.
*/

public List<Integer> doubling(List<Integer> nums) {
  return nums.stream()
    .map(x -> x * 2)
    .collect(Collectors.toList());
}