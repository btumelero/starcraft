package com.mycompany.starcraft.game.enums;

import com.mycompany.starcraft.game.interfaces.enums.IEAirUnit;

/**
 * Contains all Air Units
 * 
 * @author btume
 */
public enum EAirUnit implements IEAirUnit {

  CARRIER, 
  MOTHERSHIP, 
  MOTHERSHIP_CORE, 
  OBSERVER, 
  ORACLE, 
  PHOENIX, 
  TEMPEST, 
  VOID_RAY, 
  WARP_PRISM, 
  
  ;

  @Override
  public String getName() {
    return this.name();
  }
  
}
