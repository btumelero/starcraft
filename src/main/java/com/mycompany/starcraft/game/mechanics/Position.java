package com.mycompany.starcraft.game.mechanics;

/**
 * Position
 */
public class Position {

  private int x, y;

  public int getX() {
    return x;
  }

  public int getY() {
    return y;
  }

  public void setPosition(int x, int y) {
    this.x = x;
  }

  public static Position Istantiate(int x, int y) {
    return isValid(x, y) ? new Position(x, y) : null;
  }

  private static boolean isValid(int x, int y) {
    return false;
  }

  private Position(int x, int y) {
    this.x = x;
    this.y = y;
  }

  public Position() {

  }

}