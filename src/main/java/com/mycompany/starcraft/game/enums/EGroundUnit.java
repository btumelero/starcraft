package com.mycompany.starcraft.game.enums;

import com.mycompany.starcraft.game.interfaces.enums.IEGroundUnit;


/**
 * Unit
 */
public enum EGroundUnit implements IEGroundUnit {

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