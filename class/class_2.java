public class God {
  public static Human[] create() {
     return new Human[] { new Man(), new Woman() };
  }
}

abstract class Human {}

class Man extends Human {}

class Woman extends Human {}