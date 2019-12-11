package com.mycompany.starcraft.game.enums;

import com.mycompany.starcraft.game.interfaces.IAirUnit;
/**
 *
 * @author btume
 */
public enum EAirUnit implements IAirUnit {

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
