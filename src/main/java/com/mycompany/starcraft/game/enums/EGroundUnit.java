package com.mycompany.starcraft.game.enums;

import com.mycompany.starcraft.game.interfaces.IGroundUnit;


/**
 * Unit
 */
public enum EGroundUnit implements IGroundUnit {

  ADEPT, 
  ARCHON, 
  COLOSSUS, 
  DARK_TEMPLAR, 
  DISRUPTOR, 
  HIGH_TEMPLAR, 
  IMMORTAL, 
  INTERCEPTOR, 
  PROBE, 
  SENTRY, 
  STALKER, 
  ZEALOT,
  
  ;

  @Override
  public String getName() {
    return this.name();
  }

}