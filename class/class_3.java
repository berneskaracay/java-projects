public class Ghost {
  private final String[] colors = {"white", "yellow", "purple", "red"}; 
  
  public Ghost() {
  }
  
  public String getColor() {
    return colors[(int)(Math.random() * colors.length)];
  }
}