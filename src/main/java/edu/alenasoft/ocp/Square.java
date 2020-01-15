package edu.alenasoft.ocp;

public class Square implements Areable {

  private double size;

  public Square(double size) {
    this.size = size;
  }

  public double getSize() {
    return size;
  }

  @Override
  public double calculateArea() {
    return this.size * this.size;
  }
}
