package game.mechanics;

import game.interfaces.ILife;

/**
 *
 * @author btume
 */
public final class Life {
  
  private int hp, shield;
  private final Integer armor;
  
  public Life (ILife life) {
    this.hp = life.getHp();
    this.shield = life.getShield();
    this.armor = life.getArmor();
  }

  public int getHp() {
    return hp;
  }

  public int getShield() {
    return shield;
  }

  public Integer getArmor() {
    return armor;
  }

  public void subtract(int value){
    value = Math.abs(value);
    if (shield > 0) {
      subtractFromShield(value);
    } else {
      subtract(value);
    }
  }
  
  private void subtractFromHp (int value) {
    this.hp -= Math.abs(value - armor);
  }
  
  private void subtractFromShield (int value) {
    this.shield -= value;
  }
}
