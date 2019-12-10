package game.enums;

import game.interfaces.IBuild;
import game.interfaces.IGameObject;
import java.util.List;

/**
 * Builds
 */
public enum EBuild implements IBuild {

  // Units

  CARRIER(EUnit.INTERCEPTOR),
  PROBE(EBuilding.values()),

  // Buildings

  NEXUS(EUnit.PROBE), 
  GATEWAY(EUnit.ZEALOT), 
  CYBERNETICS_CORE(EUnit.STALKER, EUnit.SENTRY, EUnit.ADEPT),
  ROBOTICS_FACILITY(EUnit.OBSERVER, EUnit.WARP_PRISM, EUnit.IMMORTAL), 
  STARGATE(EUnit.PHOENIX, EUnit.VOID_RAY, EUnit.ORACLE),
  TEMPLAR_ARCHIVES(EUnit.HIGH_TEMPLAR, EUnit.ARCHON), 
  DARK_SHRINE(EUnit.DARK_TEMPLAR, EUnit.ARCHON),
  ROBOTICS_BAY(EUnit.COLOSSUS, EUnit.DISRUPTOR), 
  FLEET_BEACON(EUnit.CARRIER, EUnit.MOTHERSHIP, EUnit.TEMPEST)

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