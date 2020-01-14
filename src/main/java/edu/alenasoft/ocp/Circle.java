package edu.alenasoft.ocp;

public class Circle implements Areable {

  private double radius;

  public Circle(double radius) {
    this.radius = radius;
  }

  public double getRadius() {
    return radius;
  }

  @Override
  public double calculateArea() {
    return Math.PI * this.radius * this.radius;
  }
}
