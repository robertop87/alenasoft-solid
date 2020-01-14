package edu.alenasoft.ocp;

public class Rectangle implements Areable {

  private int width;

  private int height;

  public Rectangle(int width, int height) {
    this.width = width;
    this.height = height;
  }

  public int getWidth() {
    return width;
  }

  public int getHeight() {
    return height;
  }

  @Override
  public double calculateArea() {
    return this.height *  this.width;
  }
}
