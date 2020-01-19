package edu.alenasoft.dip;

import edu.alenasoft.ocp.Areable;
import java.util.ArrayList;
import java.util.List;

public class DipClient {

  private List<Areable> shapes;

  public DipClient() {
    this.shapes = new ArrayList<>();
  }

  public void showAreas() {
    shapes.forEach(
        shape -> {
          System.out.println(shape);
          System.out.println(shape.calculateArea());
        });
  }

  public void addShape(Areable shape) {
    this.shapes.add(shape);
  }
}
