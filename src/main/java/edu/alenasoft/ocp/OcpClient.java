package edu.alenasoft.ocp;

public class OcpClient {

  public static void main(String[] args) {
    // Rectangle
    Rectangle rectangle = new Rectangle(15, 10);
    System.out.println("Rectangle area " + rectangle.calculateArea());

    // Square
    Square square = new Square(10);
    System.out.println("Square area " + square.calculateArea());

    // Circle
    Circle circle = new Circle(8);
    System.out.println("Circle area " + circle.calculateArea());

    // Triangle
    Triangle triangle = new Triangle(85);
    System.out.println("Triangle area " + triangle.calculateArea());
  }
}
