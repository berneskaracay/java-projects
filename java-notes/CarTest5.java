class CarTest5 {

  public static void main(String args[]) {
    
    Car c = new Car();
    
    c.setLicensePlate("New York A45 636");
    c.setMaximumSpeed(123.45);
    
    System.out.println(c.licensePlate + " is moving at " + c.speed + 
     " kilometers per hour.");

    for (int i = 0; i < 15; i++) {
      c.accelerate(10.0);     
      System.out.println(c.licensePlate + " is moving at " + c.speed + 
       " kilometers per hour.");
    }

  }
    
}