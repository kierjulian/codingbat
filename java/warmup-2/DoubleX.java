/*
Given a string, return true if the first instance of "x" in the string is immediately followed by another "x".


doubleX("axxbb") → true
doubleX("axaxax") → false
doubleX("xxxxx") → true
*/
boolean doubleX(String str) {
  int position = str.indexOf("x");
  return position == str.length() - 1 
    ? false 
    : str.charAt(position + 1) == 'x';
}