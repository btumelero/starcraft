package com.mycompany.starcraft.game.enums;

import com.mycompany.starcraft.game.interfaces.enums.IEBuild;
import com.mycompany.starcraft.game.interfaces.enums.IEGameObject;
import java.util.List;

/**
 * Contains all Builders and its buildable game objects
 * 
 * @author btume
 */
public enum EBuilder implements IEBuild {

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

  private final List<IEGameObject> buildableGameObjects;

  @Override
  public boolean builds(IEGameObject gameObject) {
    return buildableGameObjects.contains(gameObject);
  }

  private EBuilder(IEGameObject... buildableUnits) {
    this.buildableGameObjects = List.of(buildableUnits);
  }
  
}