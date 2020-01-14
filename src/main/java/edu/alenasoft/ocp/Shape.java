package edu.alenasoft.ocp;

public class Shape {

  private ShapeType type;

  public Shape(ShapeType type) {
    this.type = type;
  }

  public double calculateArea() {
    switch (this.type) {
      case SQUARE:
        return ((Square) this).getSize() * ((Square) this).getSize();
      case RECTANGLE:
        return ((Rectangle) this).getWidth() * ((Rectangle) this).getHeight();
      case CIRCLE:
        return Math.PI * (((Circle) this).getRadius() * ((Circle) this).getRadius());
      default: return 0d;
    }
  }
}
