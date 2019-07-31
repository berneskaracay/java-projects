class Kata {
  public static String countingSheep(int num) {
   String text = " sheep...";
    String result = "";
    for (int i = 1; i <= num; i++) {
      result += i + text;
    }
    
    return result;
  }
}