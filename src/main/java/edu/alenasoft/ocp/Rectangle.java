package edu.alenasoft.ocp;

public class Rectangle extends Shape {

  private int width;

  private int height;

  public Rectangle(int width, int height) {
    super(ShapeType.RECTANGLE);
    this.width = width;
    this.height = height;
  }

  public int getWidth() {
    return width;
  }

  public int getHeight() {
    return height;
  }
}
