package com.mycompany.starcraft.game.mechanics;

/**
 *
 * @author btume
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

  public static boolean isValid(int x, int y) {
    return false;
  }

  /**
   * Instantiate directly only in test cases where it is not necessary to initialize the entire object correctly
   * @param x Use values within map bounds
   * @param y Use values within map bounds
   */
  public Position(int x, int y) {
    this.x = x;
    this.y = y;
  }

  /**
   * Instantiate directly only in test cases where it is not necessary to initialize the entire object correctly.
   */
  public Position() {

  }

}