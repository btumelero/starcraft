package com.mycompany.starcraft.game.mechanics;

import com.mycompany.starcraft.game.interfaces.enums.IELife;

public class ArmoredLife extends Life {

  private final int armor;
  
  public int getArmor() {
    return armor;
  }

  @Override
  protected void subtractFromHp(int value) {
    this.hp -= Math.abs(value - armor);
  }
  
  public ArmoredLife(IELife life) {
    super(life);
    this.armor = life.getArmor();
  }
  
}
