package com.mycompany.starcraft.game.enums;

import com.mycompany.starcraft.game.interfaces.IAdvancedBuilding;

/**
 *
 * @author btume
 */
public enum EAdvancedBuilding implements IAdvancedBuilding {
  
  DARK_SHRINE,
  FLEET_BEACON,
  ROBOTICS_BAY,
  ROBOTICS_FACILITY,
  STARGATE,
  TEMPLAR_ARCHIVES,
  TWILIGHT_COUNCIL,
  WARP_GATE,
  
  ;

  @Override
  public String getName() {
    return this.name();
  }
  
  
}
