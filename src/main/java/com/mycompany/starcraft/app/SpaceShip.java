package com.mycompany.starcraft.app;

public class SpaceShip extends Sprite {

  public SpaceShip(int x, int y) {
    super(x, y);
    initSpaceShip();
  }

  private void initSpaceShip() {
    loadImage(getClass().getResource("/Fighter_mode.gif").toString());
    getImageDimensions();
  }

}