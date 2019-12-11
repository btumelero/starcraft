package com.mycompany.starcraft.game.enums;

import com.mycompany.starcraft.game.interfaces.IBasicBuilding;

/**
 * Buildings
 */
public enum EBasicBuilding implements IBasicBuilding {

  NEXUS,
  PYLON, 
  ASSIMILATOR,
  GATEWAY,
  FORGE,
  CYBERNETICS_CORE,
  PHOTON_CANNON, 
  SHIELD_BATTERY,

  ;

  //@Override
  public String getName() {
    return this.name();
  }
  
}