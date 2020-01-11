package edu.alenasoft.lsp;

public class Square extends Rectangle {

  @Override
  public void setHeight(int height) {
    super.setHeight(height);
    this.setWidth(height);
  }

  @Override
  public void setWidth(int width) {
    //
  }

  @Override
  public int calculateArea() {
    return this.getHeight() * this.getHeight();
  }
}
