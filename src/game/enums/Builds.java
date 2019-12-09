package game.enums;

import java.util.List;

/**
 * Builds
 */
public enum Builds {

  //Units

  CARRIER(Unit.INTERCEPTOR),
  //Probes builds all buildings
  
  //Buildings

  NEXUS(Unit.PROBE),
  GATEWAY(Unit.ZEALOT),
  CYBERNETICS_CORE(Unit.STALKER, Unit.SENTRY, Unit.ADEPT),
  ROBOTICS_FACILITY(Unit.OBSERVER, Unit.WARP_PRISM, Unit.IMMORTAL),
  STARGATE(Unit.PHOENIX, Unit.VOID_RAY, Unit.ORACLE),
  TEMPLAR_ARCHIVES(Unit.HIGH_TEMPLAR, Unit.ARCHON),
  DARK_SHRINE(Unit.DARK_TEMPLAR, Unit.ARCHON),
  ROBOTICS_BAY(Unit.COLOSSUS, Unit.DISRUPTOR),
  FLEET_BEACON(Unit.CARRIER, Unit.MOTHERSHIP, Unit.TEMPEST)

  ;

  private final List<Unit> buildableUnits;

  public boolean builds (Unit unit) {
    return buildableUnits.contains(unit);
  }

  /**
   * @return the buildableUnits
   */
  public List<Unit> getBuildableUnits() {
    return buildableUnits;
  }

  private Builds(Unit... buildableUnits) {
    this.buildableUnits = List.of(buildableUnits);
  }
  
}