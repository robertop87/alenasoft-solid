package edu.alenasoft.isp.olympic;

public class IspClient {

  public static void main(String[] args) {
    JuanAthlete juan = new JuanAthlete();

    juan.compete();
    juan.swim();

    OscarAthlete oscar = new OscarAthlete();
    oscar.highJump();
    oscar.longJump();
  }
}
