package game.enums;

import game.interfaces.IUnit;
import java.util.Set;

/**
 * Unit
 */
public enum EUnit implements IUnit {

  //Ground
  
  ADEPT, 
  ARCHON, 
  COLOSSUS, 
  DARK_TEMPLAR, 
  DISRUPTOR, 
  HIGH_TEMPLAR, 
  IMMORTAL, 
  INTERCEPTOR, 
  PROBE, 
  SENTRY, 
  STALKER, 
  ZEALOT,

  //Air
  
  CARRIER, 
  MOTHERSHIP, 
  MOTHERSHIP_CORE, 
  OBSERVER, 
  ORACLE, 
  PHOENIX, 
  TEMPEST, 
  VOID_RAY, 
  WARP_PRISM, 
  
  ;

  private static final Set<String> values = Set.of(EnumUtils.getStringValues(EUnit.class));
  
  @Override
  public String getName() {
    return this.name();
  }

  @Override
  public boolean flies() {
    return values.contains(this.name());
  }
  
  
}