/*
Given a string, count the number of words ending in 'y' or 'z' -- so the 'y' in "heavy" and the 'z' in "fez" count, but not the 'y' in "yellow" (not case sensitive). 
We'll say that a y or z is at the end of a word if there is not an alphabetic letter immediately following it. 
(Note: Character.isLetter(char) tests if a char is an alphabetic letter.)


countYZ("fez day") → 2
countYZ("day fez") → 2
countYZ("day fyyyz") → 2
*/
public int countYZ(String str) {
  str = str.toLowerCase();
  str = str.replaceAll("[^a-zA-Z]", " ");
  
  int counter = 0;
  String[] listOfString = str.split(" ");
  
  return (int) Arrays.stream(listOfString)
    .filter(x -> !x.isEmpty())
    .filter(x -> (x.charAt(x.length() - 1) == 'y' 
      || x.charAt(x.length() - 1) == 'z'))
    .count();
}