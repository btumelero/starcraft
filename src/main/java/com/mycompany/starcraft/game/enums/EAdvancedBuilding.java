package com.mycompany.starcraft.game.enums;

import com.mycompany.starcraft.game.interfaces.IAdvancedBuilding;

/**
 *
 * @author btume
 */
public enum EAdvancedBuilding implements IAdvancedBuilding {
  
  ROBOTICS_FACILITY,
  WARP_GATE,
  STARGATE,
  TWILIGHT_COUNCIL,
  ROBOTICS_BAY,
  FLEET_BEACON,
  TEMPLAR_ARCHIVES,
  DARK_SHRINE,
  
  ;

  @Override
  public String getName() {
    return this.name();
  }
  
  
}
