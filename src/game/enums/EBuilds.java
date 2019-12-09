package game.enums;

import java.util.List;

/**
 * Builds
 */
public enum EBuilds {

  // Units

  CARRIER(EUnit.INTERCEPTOR),
  // Probes builds all buildings

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

  private final List<EUnit> buildableUnits;

  public boolean builds(EUnit EUnit) {
    return buildableUnits.contains(EUnit);
  }

  /**
   * @return the buildableUnits
   */
  public List<EUnit> getBuildableUnits() {
    return buildableUnits;
  }

  private EBuilds(EUnit... buildableUnits) {
    this.buildableUnits = List.of(buildableUnits);
  }
  
}