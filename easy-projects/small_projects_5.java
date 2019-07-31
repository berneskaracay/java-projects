public class Kata {
  public static boolean betterThanAverage(int[] classPoints, int yourPoints) {
    long avg = 0;
    
    for (int i : classPoints)
    {
    avg += i;
    } 
    
    avg /= classPoints.length;
    
    if (yourPoints > avg) return true;
    return false;
    
  }
}