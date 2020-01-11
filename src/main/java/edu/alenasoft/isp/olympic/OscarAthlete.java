package edu.alenasoft.isp.olympic;

public class OscarAthlete implements JumpAthlete {

  @Override
  public void compete() {
    System.out.println("Oscar compete");
  }

  @Override
  public void highJump() {
    System.out.println("Oscar high jump!");
  }

  @Override
  public void longJump() {
    System.out.println("Oscar long jump!");
  }
}
