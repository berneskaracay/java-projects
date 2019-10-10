/* Objects send messages to each other by calling methods.
Instance methods belong to a particular object.
Static methods belong to a particular class.*/

class Car {

  String licensePlate; // e.g. "New York 543 A23"
  double speed;        // in kilometers per hour
  double maxSpeed;     // in kilometers per hour

}
//These variables (licensePlate, speed and maxSpeed) 
//are called the member variables, fields of the class.


Car c = new Car();
/*
The first word, Car, declares the type of the variable c.
Classes are types and variables of a class type need to 
be declared just like variables that are ints or doubles.
The equals sign is the assignment operator and new is the 
construction operator.
Finally notice the Car() method. 
The parentheses tell you this is a method and not a data type 
like the Car on the left hand side of the assignment. 
This is a constructor, a method that creates a new instance of a class.
*/


//To access the fields of the car you use the . separator.

Car c = new Car();

c.licensePlate = "New York A45 636";
c.speed = 70.0;
c.maxSpeed = 123.45;

System.out.println(c.licensePlate + " is moving at " + c.speed + 
  "kilometers per hour.");

// Using a Car object in a different class

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

/*
This program requires not just the CarTest class but also the 
Car class. To make them work together put the Car class in a file 
called Car.java. Put the CarTest class in a file called 
CarTest.java. Put both these files in the same directory.
Then compile both files in the usual way. 
Finally run CarTest. 
For example,
% javac Car.java
% javac CarTest.java
% java CarTest
Note that Car does not have a main() method so you cannot run it. 
It can exist only when called by other programs that do have main() 
methods.
For now keep all your .java source code and .class byte code files in one directory.
*/

//Methods

/*Fields say what a class is. Methods say what a class does. 
The fields and methods of a class are collectively referred 
to as the members of the class.
The classes you've encountered up till now have mostly had a 
single method, main(). However, in general classes can have many 
different methods that do many different things.
For instance the Car class might have a method to make the car
go as fast as it can. For example,
*/

class Car {

  String licensePlate = "";    // e.g. "New York 543 A23"
  double speed        = 0.0;   // in kilometers per hour
  double maxSpeed     = 123.45; // in kilometers per hour
  
  // accelerate to maximum speed
  // put the pedal to the metal
  void floorIt() {
    this.speed = this.maxSpeed;  
  }
  
}
/*
this.speed = this.maxSpeed;
Notice that within the Car class the field names are prefixed with 
the keyword this to indicate that I'm referring to fields in the 
current object.
*/

//Implied this

class Car {

  String licensePlate = "";     // e.g. "New York 543 A23"
  double speed        = 0.0;    // in kilometers per hour
  double maxSpeed     = 123.45; // in kilometers per hour
  
  void floorIt() {
    speed = maxSpeed;
  }

}

/* Within the Car class, you don't absolutely need to prefix the 
field names with this. like this.licensePlate or this.speed. 
Just licensePlate and speed are sufficient. The this. 
may be implied. That's because the floorIt() method must be 
called by a specific instance of the Car class, and this instance 
knows what its data is. Or, another way of looking at it, 
the every object has its own floorIt() method.
*/