package edu.alenasoft.ocp;

public class Circle extends Shape {

  private double radius;

  public Circle(double radius) {
    super(ShapeType.CIRCLE);
    this.radius = radius;
  }

  public double getRadius() {
    return radius;
  }
}
