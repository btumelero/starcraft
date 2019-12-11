package com.mycompany.starcraft.game.enums;

import com.mycompany.starcraft.game.interfaces.IGroundAttack;


/**
 *
 * @author btume
 */
public enum EGroundAttack implements IGroundAttack {
  
  //Units

  ADEPT(10), 
  ARCHON(25),
  COLOSSUS(10),
  DARK_TEMPLAR(45),
  HIGH_TEMPLAR(4),
  IMMORTAL(20),
  INTERCEPTOR(5),
  MOTHERSHIP(6),
  MOTHERSHIP_CORE(8),
  ORACLE(15),
  PROBE(6),
  SENTRY(30),
  STALKER(6),
  TEMPEST(40),
  VOID_RAY(6),
  ZEALOT(8),
  
  //Buildings

  PHOTON_CANNON(20),
  PYLON(5),

  ;
  
  private final int groundAttack;

  /**
   * @return the ground attack
   */
  @Override
  public int getGroundAttack() {
    return groundAttack;
  }

  private EGroundAttack(int groundAttack) {
    this.groundAttack = groundAttack;
  }

  @Override
  public int getNumberOfAttacks() {
    return EAttack.getNumberOfAttacksOf(this);
  }
  
  
}
