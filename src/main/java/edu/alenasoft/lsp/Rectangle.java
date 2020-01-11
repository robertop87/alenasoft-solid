package edu.alenasoft.lsp;

public class Rectangle {

  private int width;
  private int height;

  public void setWidth(int width) {
    this.width = width;
  }

  public void setHeight(int height) {
    this.height = height;
  }

  public int getWidth() {
    return this.width;
  }

  public int getHeight() {
    return this.height;
  }

  public int calculateArea() {
    return this.width *  this.height;
  }
}
