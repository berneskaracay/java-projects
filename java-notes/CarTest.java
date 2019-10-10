class CarTest {

  public static void main(String args[]) {
    
    Car c = new Car();
    
    c.licensePlate = "New York A45 636";
    c.speed = 70.0;
    c.maxSpeed = 123.45;
    
    System.out.println(c.licensePlate + " is moving at " + c.speed + 
      " kilometers per hour.");    
  }
  
}