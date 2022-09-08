/*
Given a non-empty string like "Code" return a string like "CCoCodCode".


stringSplosion("Code") → "CCoCodCode"
stringSplosion("abc") → "aababc"
stringSplosion("ab") → "aab"
*/
public String stringSplosion(String str) {
  String newString = "";
  
  for (int i = 1; i < str.length() + 1; i++) {
    newString += str.substring(0, i);
  }
  
  return newString;
}