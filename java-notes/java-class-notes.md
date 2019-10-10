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

//important note:Java passes method arguments by value, not by reference.


//Setter Methods
//Setter methods, also known as mutator methods.
//These methods almost always return void.

class Car {

  String licensePlate; // e.g. "New York A456 324"
  double speed;        // kilometers per hour
  double maxSpeed;     // kilometers per hour
  
  // setter method for the license plate property
  void setLicensePlate(String licensePlate) {
    this.licensePlate = licensePlate;
  }

  // setter method for the maxSpeed property
  void setMaximumSpeed(double maxSpeed) {
    if (maxSpeed > 0) this.maxSpeed = maxSpeed;
    else this.maxSpeed = 0.0;
  }

  // accelerate to maximum speed
  // put the pedal to the metal
  void floorIt() {
    this.speed = this.maxSpeed;  
  }
  
  void accelerate(double deltaV) {

     this.speed = this.speed + deltaV;
     if (this.speed > this.maxSpeed) {
       this.speed = this.maxSpeed; 
     }
     if (this.speed <  0.0) {
       this.speed = 0.0; 
     }     
     
  }
  
}


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
// Returning Values From Methods
// A method like this that merely returns the value of an object's field or property is called a getter or accessor method.
 String getLicensePlate() {
    return this.licensePlate;
 }
/* It is not possible to return more than one value from a method. You cannot, for example, return the licensePlate, speed and 
maxSpeed fields from a single method. 
You could combine them into an object of some kind and return the object. However this would be poor object oriented design.*/

class Car {

  String licensePlate = "";     // e.g. "New York 543 A23"
  double speed        = 0.0;    // in kilometers per hour
  double maxSpeed     = 123.45; // in kilometers per hour
  
  // getter (accessor) methods
  String getLicensePlate() {
    return this.licensePlate;
  }

  double getMaxSpeed() {
    return this.maxSpeed;
  }

  double getSpeed() {
    return this.speed;
  }

  // setter method for the license plate property
  void setLicensePlate(String licensePlate) {
    this.licensePlate = licensePlate;
  }

  // setter method for the maxSpeed property
  void setMaximumSpeed(double maxSpeed) {
    if (maxSpeed > 0) this.maxSpeed = maxSpeed;
    else this.maxSpeed = 0.0;
  }

  // accelerate to maximum speed
  // put the pedal to the metal
  void floorIt() {
    this.speed = this.maxSpeed;  
  }
  
  void accelerate(double deltaV) {

     this.speed = this.speed + deltaV;
     if (this.speed > this.maxSpeed) {
       this.speed = this.maxSpeed; 
     }
     if (this.speed <  0.0) {
       this.speed = 0.0; 
     }     
     
  }
  
}


//Using Getter Methods, An Example
class CarTest6 {

  public static void main(String args[]) {
    
    Car c = new Car();
    
    c.setLicensePlate("New York A45 636");
    c.setMaximumSpeed(123.45);
    
    System.out.println(c.getLicensePlate() + " is moving at " 
     + c.getSpeed() + " kilometers per hour.");

    for (int i = 0; i < 15; i++) {
      c.accelerate(10.0);     
      System.out.println(c.getLicensePlate() + " is moving at " 
       + c.getSpeed() + " kilometers per hour.");
    }

  }
    
}

// Constructors

/*A constructor creates a new instance of the class. It initializes all the variables and does any work necessary to prepare the class to be used. 
In the line*/

Car c = new Car(); 
/*Car() is the constructor. A constructor has the same name as the class.
If no constructor exists Java provides a generic one that takes no arguments (a noargs constructor), 
but it's better to write your own. You make a constructor by writing a method that has the same name as the class. 
Thus the Car constructor is called Car().

Constructors do not have return types. They do return an instance of their own class, but this is implicit, not explicit.

The following method is a constructor that initializes license plate to an empty string, speed to zero, and maximum speed to 120.0.
*/

 Car() {
    this.licensePlate = ""; 
    this.speed  = 0.0;
    this.maxSpeed = 120.0;
  }
/*Better yet, you can create a constructor that accepts three arguments and use those to initialize the fields as below.*/

 Car(String licensePlate, double speed, double maxSpeed) {

    this.licensePlate = licensePlate; 
    this.speed  = speed;
    if (maxSpeed > 0) this.maxSpeed = maxSpeed;
    else this.maxSpeed = 0.0;
    if (speed > this.maxSpeed) this.speed = this.maxSpeed;
    if (speed < 0) this.speed = 0.0;
    else this.speed = speed;
    
  }

 /*Or perhaps you always want the initial speed to be zero, but require the maximum speed and license plate to be specified:*/

 Car(String licensePlate, double maxSpeed) {

    this.licensePlate = licensePlate; 
    this.speed  = 0.0;
    if (maxSpeed > 0) this.maxSpeed = maxSpeed;
    else this.maxSpeed = 0.0;

  }

 // The next program uses the constructor to initialize a car rather than setting the fields directly.

class CarTest7 {

  public static void main(String args[]) {
    
    Car c = new Car("New York A45 636", 123.45);
    
    System.out.println(c.getLicensePlate() + " is moving at " + c.getSpeed() + 
     " kilometers per hour.");

    for (int i = 0; i < 15; i++) {
      c.accelerate(10.0);
      System.out.println(c.getLicensePlate() + " is moving at " + c.getSpeed() 
       + " kilometers per hour.");
    }

  }
    
}

/*You may ask whether the setLicensePlate() method is still needed since it's now set in a constructor. 
The general answer to this question depends on the use to which the Car class is to be put.
 The specific question is whether a car's license plate may need to be changed after the Car object is created.

Some classes may not change after they're created; or, if they do change, they'll represent a different object. 
The most common such class is String. You cannot change a string's data. You can only create a new String object. 
Such objects are called immutable.
*/

//Examples of Access Protection

/*This is how the Car class would probably be written in practice. 
Notice that all the fields are now declared private, and they are accessed only through public methods. 
This is the normal pattern for all but the simplest classes.*/

public class Car {

  private String licensePlate; // e.g. "New York A456 324"
  private double speed;        // kilometers per hour
  private double maxSpeed;     // kilometers per hour
  
  public Car(String licensePlate, double maxSpeed) {

    this.licensePlate = licensePlate; 
    this.speed  = 0.0;
    if (maxSpeed >= 0.0) {
      this.maxSpeed = maxSpeed;
    }
    else {
      maxSpeed = 0.0;
    }
    
  }

  // getter (accessor) methods
  public String getLicensePlate() {
    return this.licensePlate;
  }

  public double getSpeed() {
    return this.speed;
  }

  public double getMaxSpeed() {
    return this.maxSpeed;
  }

  // setter method for the license plate property
  public void setLicensePlate(String licensePlate) {
    this.licensePlate = licensePlate;
  }

  // accelerate to maximum speed
  // put the pedal to the metal
  public void floorIt() {
    this.speed = this.maxSpeed;  
  }
  
  public void accelerate(double deltaV) {

     this.speed = this.speed + deltaV;
     if (this.speed > this.maxSpeed) {
       this.speed = this.maxSpeed; 
     }
     if (this.speed <  0.0) {
       this.speed = 0.0; 
     }     
     
  }
  
}


//Now let's try to directly access the fields from another class and see what happens:

class CarTest8 {

  public static void main(String args[]) {
    
    Car c = new Car("New York A45 636", 100.0);
    
    c.licensePlate = "New York A45 636";
    c.speed = 0.0;
    c.maxSpeed = 123.45;
    
    System.out.println(c.licensePlate + " is moving at " + c.speed + 
     " kilometers per hour.");

    c.floorIt();
    
    System.out.println(c.licensePlate + " is moving at " + c.speed + 
     " kilometers per hour.");

  }
    
}
//Here's what happens when you try to compile it against the revised Car class:

% javac Car.java
% javac CarTest8.java
CarTest8.java:7: Variable licensePlate in class Car not accessible from class CarTest8.
    c.licensePlate = "New York A45 636";
     ^
CarTest8.java:8: Variable speed in class Car not accessible from class CarTest8.
    c.speed = 0.0;
     ^
CarTest8.java:9: Variable maxSpeed in class Car not accessible from class CarTest8.
    c.maxSpeed = 123.45;
     ^
CarTest8.java:11: Variable licensePlate in class Car not accessible from class CarTest8.
    System.out.println(c.licensePlate + " is moving at " + c.speed +
                        ^
CarTest8.java:11: Variable speed in class Car not accessible from class CarTest8.
    System.out.println(c.licensePlate + " is moving at " + c.speed +
                                                            ^
CarTest8.java:16: Variable licensePlate in class Car not accessible from class CarTest8.
    System.out.println(c.licensePlate + " is moving at " + c.speed +
                        ^
CarTest8.java:16: Variable speed in class Car not accessible from class CarTest8.
    System.out.println(c.licensePlate + " is moving at " + c.speed +
                                                            ^
7 errors

// The Four Levels of Access Protection
/*If you want any object at all to be able to call a method or change a field, declare it public.

If you want only objects in the same class to be able to get or set the value of a field or invoke a method, declare it private.

If you want access restricted to subclasses and members of the same package, declare it protected.

Finally, to restrict access only to objects in the same package, use no access declaration at all. 
This is called "package" or "default" access, but it has no keyword. The default keyword means something else entirely.

The Three Benefits of Access Protection
Access protection has three main benefits:

It allows you to enforce constraints on an object's state.
It provides a simpler client interface. Client programmers don't need to know everything that's in the class, only the public parts.
It separates interface from implementation, allowing them to vary independently. 
For instance consider making the licensePlate field of Car an instance of a new LicensePlate class instead of a String.

What should be public? What should be private?
As a rule of thumb:

Classes are public.
Fields are private.
Constructors are public.
Getter and setter methods are public.
Other methods must be decided on a case by case basis.
All of these rules may be freely violated if you have a reason for doing so. 
These are simply the defaults that handle 90% of the cases.

/*
//Overloading
/*Overloading is when the same method or operator can be used on many different types of data. 
For instance the + sign is used to add ints as well as concatenate strings. 
The plus sign behaves differently depending on the type of its arguments. 
Therefore the plus sign is inherently overloaded.
Methods can be overloaded as well. System.out.println() can print a double, a float, an int, a long, or a String. 
You don't do anything different depending on the type of number you want the value of. Overloading takes care of it.
*/
/*
Programmer-defined classes can overload methods as well. To do this simply write two methods with the same name but different argument lists.
 For instance last week you saw several different versions of the Car constructor, one that took three arguments and one that took two arguments, 
 and one that took no arguments. 
You can use all of these in a single class, 
though here I only use two because there really aren't any good default values for licensePlate and maxSpeed. 
On the other hand, 0 is a perfectly reasonable default value for speed.
*/
public class Car {

  private String licensePlate; // e.g. "New York A456 324"
  private double speed;        // kilometers per hour
  private double maxSpeed;     // kilometers per hour
  
  // constructors
  public Car(String licensePlate, double maxSpeed) {

    this.licensePlate = licensePlate; 
    this.speed  = 0.0;
    if (maxSpeed >= 0.0) {
      this.maxSpeed = maxSpeed;
    }
    else {
      maxSpeed = 0.0;
    }
    
  }
  // another way constructors
  public Car(String licensePlate, double maxSpeed) {

    this(licensePlate, 0.0, maxSpeed);
    
  }
  public Car(String licensePlate, double speed, double maxSpeed) {

    this.licensePlate = licensePlate; 
    if (maxSpeed >= 0.0) {
      this.maxSpeed = maxSpeed;
    }
    else {
      maxSpeed = 0.0;
    }
    
    if (speed < 0.0) {
      speed = 0.0;
    }
    
    if (speed <= maxSpeed) {
      this.speed = speed;
    }
    else {
      this.speed = maxSpeed;
    }
    
  }

  // other methods...
  
}

/*
Normally a single identifier refers to exactly one method or constructor.
 When as above, one identifier refers to more than one method or constructor, the method is said to be overloaded. 
 You could argue that this should be called identifier overloading rather than method overloading since 
 it's the identifier that refers to more than one method, not the method that refers to more than one identifier. 
 However in common usage this is called method overloading.
 If there are no arguments to the constructor, or two or three arguments that aren't the right type in the right order, 
 then the compiler generates an error because it doesn't have a method whose signature matches the requested method call. 
 For example
Error:    Method Car(double) not found in class Car.
Car.java  line 17    
 */


//Inheritance


/*
Now suppose you also need a class for a motorcycle. A motorcycle also has a make, a model, a year, a speed, a maximum speed,
 a weight, a price, a number of passengers it can carry, two wheels and many other properties you can represent with fields. 
 A class that represents a motorcycle might look like this:
 */

/*
There's a lot of overlap between the class definitions for Car and Motorcycle. 
In fact the only things that are different are the constructors and a few of the fields.
Inheritance takes advantage of the overlap.
*/

//Inheritance: the Superclass
//In this example you begin by defining a more general MotorVehicle class.

public class MotorVehicle {

  private String licensePlate;      // e.g. "New York A456 324"
  private double speed;             // kilometers per hour
  private double maxSpeed;          // kilometers per hour
  private String make;              // e.g. "Harley-Davidson", "Ford"
  private String model;             // e.g. "Fatboy", "Taurus"
  private int    year;              // e.g. 1998, 1999, 2000, 2001, etc.
  private int    numberPassengers;  // e.g. 4
  
  
  // constructors
  public MotorVehicle(String licensePlate, double maxSpeed,
   String make, String model, int year, int numberOfPassengers) {
    this(licensePlate, 0.0, maxSpeed, make, model, year, numberOfPassengers);    
  }

  public MotorVehicle(String licensePlate, double speed, double maxSpeed,
   String make, String model, int year, int numberOfPassengers) {

    // I could add some more constraints like the
    // number of doors being positive but I won't
    // so that this example doesn't get too big.
    this.licensePlate = licensePlate; 
    this.make = make; 
    this.model = model; 
    this.year = year; 
    this.numberPassengers = numberOfPassengers; 

    if (maxSpeed >= 0.0) {
      this.maxSpeed = maxSpeed;
    }
    else {
      maxSpeed = 0.0;
    }
    
    if (speed < 0.0) {
      speed = 0.0;
    }
    
    if (speed <= maxSpeed) {
      this.speed = speed;
    }
    else {
      this.speed = maxSpeed;
    }
    
  }
  
  
  // getter (accessor) methods
  public String getLicensePlate() {
    return this.licensePlate;
  }

  public String getMake() {
    return this.make;
  }

  public String getModel() {
    return this.model;
  }

  public int getYear() {
    return this.year;
  }
  
  public int getNumberOfPassengers() {
    return this.numberPassengers;
  }
  
  public int getNumberOfPassengers() {
    return this.numberWheels;
  }
  
  public double getMaxSpeed() {
    return this.maxSpeed;
  }

  public double getSpeed() {
    return this.speed;
  }

  // setter method for the license plate property
  protected void setLicensePlate(String licensePlate) {
    this.licensePlate = licensePlate;
  }

  // accelerate to maximum speed
  // put the pedal to the metal
  public void floorIt() {
    this.speed = this.maxSpeed;  
  }
  
  public void accelerate(double deltaV) {

     this.speed = this.speed + deltaV;
     if (this.speed > this.maxSpeed) {
       this.speed = this.maxSpeed; 
     }
     if (this.speed < 0.0) {
       this.speed = 0.0; 
     }     
     
  }
  
}
/*The MotorVehicle class has all the characteristics shared by motorcycles and cars,
 but it leaves the number of wheels unspecified, and it doesn't have a numberDoors field since not all motor vehicles have doors. 
 It also makes the fields and the setLicensePlate() method protected instead of private and public.
 */

//Inheritance: the Superclass
//In this example you begin by defining a more general MotorVehicle class.

public class MotorVehicle {

  private String licensePlate;      // e.g. "New York A456 324"
  private double speed;             // kilometers per hour
  private double maxSpeed;          // kilometers per hour
  private String make;              // e.g. "Harley-Davidson", "Ford"
  private String model;             // e.g. "Fatboy", "Taurus"
  private int    year;              // e.g. 1998, 1999, 2000, 2001, etc.
  private int    numberPassengers;  // e.g. 4
  
  
  // constructors
  public MotorVehicle(String licensePlate, double maxSpeed,
   String make, String model, int year, int numberOfPassengers) {
    this(licensePlate, 0.0, maxSpeed, make, model, year, numberOfPassengers);    
  }

  public MotorVehicle(String licensePlate, double speed, double maxSpeed,
   String make, String model, int year, int numberOfPassengers) {

    // I could add some more constraints like the
    // number of doors being positive but I won't
    // so that this example doesn't get too big.
    this.licensePlate = licensePlate; 
    this.make = make; 
    this.model = model; 
    this.year = year; 
    this.numberPassengers = numberOfPassengers; 

    if (maxSpeed >= 0.0) {
      this.maxSpeed = maxSpeed;
    }
    else {
      maxSpeed = 0.0;
    }
    
    if (speed < 0.0) {
      speed = 0.0;
    }
    
    if (speed <= maxSpeed) {
      this.speed = speed;
    }
    else {
      this.speed = maxSpeed;
    }
    
  }
  
  
  // getter (accessor) methods
  public String getLicensePlate() {
    return this.licensePlate;
  }

  public String getMake() {
    return this.make;
  }

  public String getModel() {
    return this.model;
  }

  public int getYear() {
    return this.year;
  }
  
  public int getNumberOfPassengers() {
    return this.numberPassengers;
  }
  
  public int getNumberOfPassengers() {
    return this.numberWheels;
  }
  
  public double getMaxSpeed() {
    return this.maxSpeed;
  }

  public double getSpeed() {
    return this.speed;
  }

  // setter method for the license plate property
  protected void setLicensePlate(String licensePlate) {
    this.licensePlate = licensePlate;
  }

  // accelerate to maximum speed
  // put the pedal to the metal
  public void floorIt() {
    this.speed = this.maxSpeed;  
  }
  
  public void accelerate(double deltaV) {

     this.speed = this.speed + deltaV;
     if (this.speed > this.maxSpeed) {
       this.speed = this.maxSpeed; 
     }
     if (this.speed < 0.0) {
       this.speed = 0.0; 
     }     
     
  }
  
}
/*The MotorVehicle class has all the characteristics shared by motorcycles and cars, 
but it leaves the number of wheels unspecified, and it doesn't have a numberDoors field since not all motor vehicles have doors.
It also makes the fields and the setLicensePlate() method protected instead of private and public.
*/

//Inheritance: The Car subclass
public class Car extends MotorVehicle {

  private int numberWheels = 4;  
  private int numberDoors;
  
  
  // constructors
  public Car(String licensePlate, double maxSpeed,
   String make, String model, int year, int numberOfPassengers,
   int numberOfDoors) {
    this(licensePlate, 0.0, maxSpeed, make, model, year, numberOfPassengers, 
     numberOfDoors);    
  }

  public Car(String licensePlate, double speed, double maxSpeed,
   String make, String model, int year, int numberOfPassengers) {
    this(licensePlate, speed, maxSpeed, make, model, year, 
     numberOfPassengers, 4);    
  }

  public Car(String licensePlate, double speed, double maxSpeed,
   String make, String model, int year, int numberOfPassengers,
   int numberOfDoors) {
    super(licensePlate, speed, maxSpeed, make, model,
     year, numberOfPassengers);
    this.numberDoors = numberOfDoors;
  }
   
  public int getNumberOfWheels() {
    return this.numberWheels;
  }
 
  public int getNumberOfDoors() {
    return this.numberDoors;
  }
    
}
/*It may look like these classes aren't as complete as the earlier ones, but that's incorrect.
 Car and Motorcycle each inherit the members of their superclass, MotorVehicle. 
 Since a MotorVehicle has a make, a model, a year, a speed, a maximum speed, a number of passengers, 
 cars and motorcycles also have makes, models, years, speeds, maximum speeds, and numbers of passengers. 
 They also have all the public methods the superclass has. They do not have the same constructors, 
 though they can invoke the superclass constructor through the super keyword, much as a constructor 
 in the same class can be invoked with the this keyword.
 */


//Multilevel Inheritance
/*The Car-Motorcycle-MotorVehicle example showed single-level inheritance. 
There's nothing to stop you from going further. You can define subclasses of cars for compacts, 
station wagons, sports coupes and more. For example, this class defines a compact as a car with two doors:
 */
public class Compact extends Car {

  // constructors
  public Compact(String licensePlate, double maxSpeed,
   String make, String model, int year, int numberOfPassengers) {
    this(licensePlate, 0.0, maxSpeed, make, model, year, numberOfPassengers);    
  }

  public Compact(String licensePlate, double speed, double maxSpeed,
   String make, String model, int year, int numberOfPassengers) {
    super(licensePlate, speed, maxSpeed, make, model,
     year, numberOfPassengers, 2);
  }
   
}

//Overriding Methods: The Solution
/*The object oriented solution to this problem is to define a new class, call it SlowCar, 
which inherits from Car and imposes the additional constraint that a car may not go faster than 70 mph (112.65 kph).

To do this you'll need to adjust the two places that speed can be changed, the constructor and the accelerate() method. 
The constructor has a different name because all constructors are named after their classes but the accelerate() 
method must be overridden. This means the subclass has a method with the same signature as the method in the superclass.
*/
public class SlowCar extends Car {

  private static final double speedLimit = 112.65408; // kph == 70 mph

  public SlowCar(String licensePlate, double speed, double maxSpeed,
   String make, String model, int year, int numberOfPassengers, int numDoors) {
    
    super(licensePlate, 0, maxSpeed, make, model, year, 
     numberOfPassengers, numDoors);
    this.accelerate(speed);
    
  }

  public void accelerate(double deltaV) {

     double speed = this.getSpeed() + deltaV;
     
     if (speed > speedLimit) {
       super.accelerate(speedLimit - this.getSpeed());
     }
     else {
       super.accelerate(deltaV);  
     }  
     
  }
   
}
/*
The first thing to note about this class is what it doesn't have, getSpeed(), getLicensePlate(), getMaximumSpeed(), 
setLicensePlate() methods or speed, maxSpeed and numDoors fields. All of these are provided by the superclass Car. 
Nothing about them has changed so they don't need to be repeated here.
Next look at the accelerate() method. This is different than the accelerate() method in Car. 
It imposes the additional constraint.

The constructor is a little more complicated. First note that if you're going to use a non-default constructor, 
that is a constructor with arguments, you do need to write a constructor for the subclass,
even if it's just going to do the exact same thing as the matching constructor in the superclass. 
You cannot simply inherit Car's constructor because that constructor is named Car() and this one must be named SlowCar().

The constructor needs to set the value of name, url, and description. 
However they're not accessible from the subclass. Instead they are set by calling the superclass's constructor using the keyword super. 
When super is used as a method in the first non-blank line of a constructor, it stands for the constructor of this class's superclass.

The immediate superclass's constructor will be called in the first non-blank line of the subclass's constructor. 
If you don't call it explicitly, then Java will call it for you with no arguments. 
It's a compile time error if the immediate superclass doesn't have a constructor with no arguments and 
you don't call a different constructor in the first line of the subclass's constructor.

The use of the ternary operator in the constructor call is unusual. However, 
it's necessary to meet the compiler's requirement that the invocation of super be the first line in the subclass constructor. 
Otherwise this could be written more clearly using only if-else.
*/

//Subclasses and Polymorphism
/*Car and Motorcycle are subclasses of MotorVehicle. 
If you instantiate a Car or a Motorcycle with new, you can use that object anywhere you can use a MotorVehicle, 
because cars are motor vehicles. Similarly you can use a Motorcycle anywhere you can use a MotorVehicle. 
This use of a subclass object in place of a superclass object is the beginning of polymorphism. 
I'll say more about polymorphism later.

The converse is not true. Although all cars are motor vehicles, not all motor vehicles are cars.
 Some are motorcycles. Therefore if a method expects a Car object you shouldn't give it a MotorVehicle object instead.
*/

//Class or static Members
/* 
A method or a field in a Java program can be declared static. 
This means the member belongs to the class rather than to an individual object.

If a variable is static, then when any object in the class changes the value of the variable,
that value changes for all objects in the class.

For example, suppose the Car class contained a speedLimit field that was set to 112 kph (70 mph). This would be the same for all cars. 
If it changed (by act of Congress) for one car, it would have to change for all cars. This is a typical static field.

Methods are often static is if they neither access nor modify any of the instance (non-static) fields of a class and 
they do not invoke any non-static methods in the class. This is common in calculation methods like a square root 
method that merely operate on their arguments and return a value. One way of thinking of it is that a 
method should be static if it neither uses nor needs to use this.
*/
