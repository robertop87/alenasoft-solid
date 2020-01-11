package edu.alenasoft.lsp;

public class LspClient {

  public static void main(String[] args) {
    Rectangle rectangle = new Rectangle();
    rectangle.setHeight(5);
    rectangle.setWidth(10);

    System.out.println("--- Rectangle ---");
    System.out.println(rectangle.calculateArea());

    Rectangle square = new Square();
    //square.setHeight(10);

    square.setWidth(5);

    System.out.println(square.calculateArea());
  }
}
