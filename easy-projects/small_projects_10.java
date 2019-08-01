public class CodeWars {
  public static int strCount(String str, char letter) {
    int counter = 0;
    for(char character : str.toCharArray()) {
      if(letter == character) {
        counter++;
      }
    }
    return counter;
  }
}