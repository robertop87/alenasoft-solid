package edu.alenasoft.ocp;

public class Square extends Shape {

  private double size;

  public Square(double size) {
    super(ShapeType.SQUARE);
    this.size = size;
  }

  public double getSize() {
    return size;
  }
}
