class CarTest3 {

  public static void main(String args[]) {
    
    Car c = new Car();
    
    c.licensePlate = "New York A45 636";
    c.maxSpeed = 123.45;
    
    System.out.println(c.licensePlate + " is moving at " + c.speed + 
     " kilometers per hour.");

    c.floorIt();
    
    System.out.println(c.licensePlate + " is moving at " + c.speed + 
     " kilometers per hour.");

  }
    
}