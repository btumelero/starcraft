package com.mycompany.starcraft.game.mechanics;

import com.mycompany.starcraft.game.interfaces.enums.IELife;

/**
 *
 * @author btume
 */
public class Life {
  
  protected int hp, shield;

  public int getHp() {
    return hp;
  }

  public int getShield() {
    return shield;
  }

  /**
   *
   * @param value the value to be subtracted
   * @return the remaining hp
   */
  public int subtract(int value){
    value = Math.abs(value);
    if (shield > 0) {
      subtractFromShield(value);
    } else {
      subtractFromHp(value);
    }
    return hp;
  }
  
  protected void subtractFromHp (int value) {
    this.hp -= value;
  }
  
  private void subtractFromShield (int value) {
    this.shield -= value;
  }
  
  public Life (IELife life) {
    this.hp = life.getHp();
    this.shield = life.getShield();
  }
}
