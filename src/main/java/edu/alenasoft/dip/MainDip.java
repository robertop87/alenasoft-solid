package edu.alenasoft.dip;

import edu.alenasoft.ocp.Circle;
import edu.alenasoft.ocp.Rectangle;

public class MainDip {

  public static void main(String[] args) {
    DipClient client = new DipClient();

    client.addShape(new Rectangle(15, 15));
    client.addShape(new Rectangle(15, 10));
    client.addShape(new Rectangle(8, 15));
    client.addShape(new Circle(15));

    client.showAreas();
  }
}
