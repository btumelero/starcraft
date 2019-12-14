package com.mycompany.starcraft.game.enums;

import com.mycompany.starcraft.game.interfaces.enums.IEBasicBuilding;

/**
 * Contains all Basic Buildings
 * 
 * @author btume
 */
public enum EBasicBuilding implements IEBasicBuilding {

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