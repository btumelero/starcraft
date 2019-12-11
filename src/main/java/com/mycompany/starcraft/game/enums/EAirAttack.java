package com.mycompany.starcraft.game.enums;

import com.mycompany.starcraft.game.interfaces.IAirAttack;

/**
 *
 * @author btume
 */
public enum EAirAttack implements IAirAttack {
  
  //Units

  ARCHON(25),
  INTERCEPTOR(5),
  MOTHERSHIP(6),
  PHOENIX(5),
  PROBE(6),
  SENTRY(30),
  STALKER(6),
  TEMPEST(30),
  VOID_RAY(6),
  
  //Buildings

  PHOTON_CANNON(20),

  ;
  
  private final int airAttack;

  /**
   * @return the air attack
   */
  @Override
  public int getAirAttack() {
    return airAttack;
  }


  @Override
  public int getNumberOfAttacks() {
    return EAttack.getNumberOfAttacksOf(this);
  }
  
  private EAirAttack(int airAttack) {
    this.airAttack = airAttack;
  }
  
}
