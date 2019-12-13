package com.mycompany.starcraft.game.enums;

import com.mycompany.starcraft.game.interfaces.IBasicBuilding;

/**
 * Buildings
 */
public enum EBasicBuilding implements IBasicBuilding {

  ASSIMILATOR,
  CYBERNETICS_CORE,
  FORGE,
  GATEWAY,
  NEXUS,
  PHOTON_CANNON, 
  PYLON, 
  SHIELD_BATTERY,

  ;

  //@Override
  public String getName() {
    return this.name();
  }
  
}