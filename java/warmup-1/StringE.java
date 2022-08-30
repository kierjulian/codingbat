/*
Return true if the given string contains between 1 and 3 'e' chars.


stringE("Hello") → true
stringE("Heelle") → true
stringE("Heelele") → false
*/
public boolean stringE(String str) {
  Long numOfE = str.chars().filter(character -> character == 'e').count();
  return 1 <= numOfE && numOfE <= 3;
}