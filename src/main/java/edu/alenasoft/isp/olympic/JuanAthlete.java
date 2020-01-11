package edu.alenasoft.isp.olympic;

public class JuanAthlete implements SwimAthlete {

  @Override
  public void compete() {
    System.out.println("Juan compete");
  }

  @Override
  public void swim() {
    System.out.println("Juan is swimming");
  }
}
