package com.mycompany.starcraft.game.mechanics;

import com.mycompany.starcraft.game.interfaces.enums.IEArmoredLife;

/**
 *
 * @author btume
 */
public class ArmoredLife extends Life {

  private final int armor;
  
  public int getArmor() {
    return armor;
  }

  @Override
  protected void subtractFromHp(int value) {
    this.hp -= Math.abs(value - armor);
  }
  
  /**
   * Instantiate directly only in test cases where it is not necessary to initialize the entire object correctly
   * @param armoredLife Use EArmoredLife here
   */
  public ArmoredLife(IEArmoredLife armoredLife) {
    super(armoredLife);
    this.armor = armoredLife.getArmor();
  }
  
}
