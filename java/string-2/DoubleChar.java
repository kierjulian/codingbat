/*
Given a string, return a string where for every char in the original, there are two chars.


doubleChar("The") → "TThhee"
doubleChar("AAbb") → "AAAAbbbb"
doubleChar("Hi-There") → "HHii--TThheerree"
*/
public String doubleChar(String str) {
  String newString = "";
  for (Character character : str.toCharArray()) {
    newString = newString + character + character;
  }
  
  return newString;
}