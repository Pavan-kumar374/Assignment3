class Shape {
  public String name;

  public Shape(String name) {
    this.name = name;
  }
  public double area() {
    return 0.0;
  }

  public double area(int side) {
    return side * side;
  }
}

class Square extends Shape {
  private int side;

  public Square(int side) {
    super("Square");
    this.side = side;
  }
  @Override
  public double area() {
    return side * side;
  }
}

class Rectangle extends Shape {
  private int length;
  private int width;

  public Rectangle(int length, int width) {
    super("Rectangle");
    this.length = length;
    this.width = width;
  }

  @Override
  public double area() {
    return length * width;
  }
}

public class Main {
  public static void main(String[] args) {
    Square square = new Square(5);
    Rectangle rectangle = new Rectangle(4, 6);

    System.out.println("Area of Square: " + square.area());
    System.out.println("Area of Rectangle: " + rectangle.area()); 
  }
}