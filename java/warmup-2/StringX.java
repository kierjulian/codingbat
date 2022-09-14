/*
Given a string, return a version where all the "x" have been removed. 
Except an "x" at the very start or end should not be removed.


stringX("xxHxix") → "xHix"
stringX("abxxxcd") → "abcd"
stringX("xabxxxcdx") → "xabcdx"
*/

public String stringX(String str) {
  if (str.length() < 2) {
    return str;
  }
  
  return str.charAt(0) + str.substring(1, str.length() - 1).replace("x", "") 
    + str.charAt(str.length() - 1);
}