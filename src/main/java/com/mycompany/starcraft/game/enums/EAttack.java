package com.mycompany.starcraft.game.enums;

import com.mycompany.starcraft.game.interfaces.IAttack;


/**
 * Attack
 */
public enum EAttack {

  //Units

  ADEPT(1), 
  ARCHON(1),
  COLOSSUS(2),
  DARK_TEMPLAR(1),
  HIGH_TEMPLAR(1),
  IMMORTAL(1),
  INTERCEPTOR(2),
  MOTHERSHIP(6),
  MOTHERSHIP_CORE(1),
  ORACLE(1),
  PHOENIX(2),
  PROBE(1),
  SENTRY(1),
  STALKER(1),
  TEMPEST(1),
  VOID_RAY(1),
  ZEALOT(2),
  
  //Buildings

  PHOTON_CANNON(1),
  PYLON(1),

  ;

  private final int numberOfAttacks;
  
  /**
   * @param attacker
   * @return the numberOfAttacks
   */
  public static int getNumberOfAttacksOf(IAttack attacker) {
    return EAttack.valueOf(attacker.toString()).numberOfAttacks;
  }
  
  private EAttack(int numberOfAttacks){
    this.numberOfAttacks = numberOfAttacks;
  }

}