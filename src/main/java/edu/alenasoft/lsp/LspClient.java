package edu.alenasoft.lsp;

public class LspClient {

  public static void main(String[] args) {
    Rectangle rectangle = new Rectangle();
    rectangle.setHeight(5);
    rectangle.setWidth(10);

    System.out.println("--- Rectangle ---");
    showArea(rectangle);

    Square square = new Square();
    square.setSize(15);

    System.out.println("--- Square ---");
    showArea(square);
  }

  public static void showArea(Shape shape) {
    System.out.println(shape.calculateArea());
  }
}
