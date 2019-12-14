package com.mycompany.starcraft.game.enums;

import com.mycompany.starcraft.game.interfaces.enums.IELife;


/**
 * Contains all hp and shield values of unarmored game objects
 * 
 * @author btume
 */
public enum ELife implements IELife {

  // Units

  ARCHON(10, 350), 
  HIGH_TEMPLAR(40, 40), 
  INTERCEPTOR(40, 40), 
  OBSERVER(40, 20), 
  ORACLE(100, 60), 
  PHOENIX(120, 60), 
  PROBE(20, 20), 
  VOID_RAY(150, 100), 
  WARP_PRISM(80, 100), 

  ;

  private int hp, shield;

  /**
   * @return the hp
   */
  @Override
  public int getHp() {
    return hp;
  }

  /**
   * @return the shield
   */
  @Override
  public int getShield() {
    return shield;
  }

  private ELife(int hp, int shield) {
    this.hp = hp;
    this.shield = shield;
  }
  
}