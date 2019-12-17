package com.mycompany.starcraft.game.mechanics;

import com.mycompany.starcraft.game.interfaces.enums.IELife;

/**
 *
 * @author btume
 */
public class Life {
  
  protected int hp, shield, armor;

  public int getHp() {
    return hp;
  }

  public int getShield() {
    return shield;
  }

  /**
   * @return the armor
   */
  public int getArmor() {
    return armor;
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
    this.hp -= Math.abs(value - armor);
  }
  
  private void subtractFromShield (int value) {
    this.shield -= value;
  }
  
  /**
   * Instantiate directly only in test cases where it is not necessary to initialize the entire object correctly
   * @param life Use ELife here
   */
  public Life (IELife life) {
    this.hp = life.getHp();
    this.shield = life.getShield();
    this.armor = life.getArmor();
  }
  
}
