package game.enums;

import game.interfaces.IGameObject;

/**
 * Buildings
 */
public enum EBuilding implements IGameObject {

  NEXUS,
  PYLON, 
  ASSIMILATOR,
  GATEWAY,
  FORGE,
  PHOTON_CANNON, 
  SHIELD_BATTERY,
  WARP_GATE,
  CYBERNETICS_CORE,
  TWILIGHT_COUNCIL,
  ROBOTICS_FACILITY,
  STARGATE,
  TEMPLAR_ARCHIVES,
  DARK_SHRINE,
  ROBOTICS_BAY,
  FLEET_BEACON

  ;

  @Override
  public String getName() {
    return this.name();
  }
  
}