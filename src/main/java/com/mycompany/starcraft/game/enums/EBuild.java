package com.mycompany.starcraft.game.enums;

import com.mycompany.starcraft.game.interfaces.IBuild;
import com.mycompany.starcraft.game.interfaces.IGameObject;
import java.util.List;

/**
 * Builds
 */
public enum EBuild implements IBuild {

  // Units

  CARRIER(EGroundUnit.INTERCEPTOR),
  PROBE(EBasicBuilding.values()),

  // Buildings

  NEXUS(EGroundUnit.PROBE), 
  GATEWAY(EGroundUnit.ZEALOT), 
  CYBERNETICS_CORE(EGroundUnit.STALKER, EGroundUnit.SENTRY, EGroundUnit.ADEPT),
  ROBOTICS_FACILITY(EAirUnit.OBSERVER, EAirUnit.WARP_PRISM, EGroundUnit.IMMORTAL), 
  STARGATE(EAirUnit.PHOENIX, EAirUnit.VOID_RAY, EAirUnit.ORACLE),
  TEMPLAR_ARCHIVES(EGroundUnit.HIGH_TEMPLAR, EGroundUnit.ARCHON), 
  DARK_SHRINE(EGroundUnit.DARK_TEMPLAR, EGroundUnit.ARCHON),
  ROBOTICS_BAY(EGroundUnit.COLOSSUS, EGroundUnit.DISRUPTOR), 
  FLEET_BEACON(EAirUnit.CARRIER, EAirUnit.MOTHERSHIP, EAirUnit.TEMPEST)

  ;

  private final List<IGameObject> buildableUnits;

  @Override
  public boolean builds(IGameObject gameObject) {
    return buildableUnits.contains(gameObject);
  }

  /**
   * @return the buildableUnits
   */
  @Override
  public List<IGameObject> getBuildableGameObjects() {
    return buildableUnits;
  }

  private EBuild(IGameObject... buildableUnits) {
    this.buildableUnits = List.of(buildableUnits);
  }
  
}