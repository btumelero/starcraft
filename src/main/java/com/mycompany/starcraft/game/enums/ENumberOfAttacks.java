package com.mycompany.starcraft.game.enums;

import com.mycompany.starcraft.game.interfaces.enums.IEAttack;


/**
 * Contains all number of attacks values
 * 
 * @author btume
 */
public enum ENumberOfAttacks {

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
  public static int getNumberOfAttacksOf(IEAttack attacker) {
    return ENumberOfAttacks.valueOf(attacker.toString()).numberOfAttacks;
  }
  
  private ENumberOfAttacks(int numberOfAttacks){
    this.numberOfAttacks = numberOfAttacks;
  }

}