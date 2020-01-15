package edu.alenasoft.ocp;

public class Triangle implements Areable {

  private double base;

  public Triangle(double base) {
    this.base = base;
  }

  @Override
  public double calculateArea() {
    return 0.5 * this.base;
  }
}
