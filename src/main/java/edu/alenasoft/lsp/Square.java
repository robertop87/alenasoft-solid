package edu.alenasoft.lsp;

public class Square implements Shape {

  private int size;

  public void setSize(int size) {
    this.size = size;
  }

  @Override
  public int calculateArea() {
    return this.size * this.size;
  }
}
