package com.mycompany.starcraft.game.enums;

import com.mycompany.starcraft.game.interfaces.enums.IERange;


/**
 * Contains all Range values
 * 
 * @author btume
 */
public enum ERange implements IERange {

  // Units

  ADEPT(4), 
  ARCHON(3), 
  CARRIER(8), 
  COLOSSUS(7), 
  DARK_TEMPLAR(0), 
  HIGH_TEMPLAR(6), 
  IMMORTAL(6), 
  INTERCEPTOR(2),
  MOTHERSHIP(7), 
  MOTHERSHIP_CORE(5), 
  ORACLE(4), 
  PHOENIX(5), 
  PROBE(5), 
  SENTRY(7), 
  STALKER(5), 
  TEMPEST(10, 14),
  VOID_RAY(6), 
  ZEALOT(0),

  // Buildings

  PHOTON_CANNON(7), PYLON(0)

  ;

  private int groundRange;
  private Integer airRange;

  /**
   * @return the range
   */
  @Override
  public int getRange() {
    return groundRange;
  }

  @Override
  public Integer getAirRange() {
    return airRange;
  }

  private ERange(int range) {
    this.groundRange = range;
  }

  private ERange(int groundRange, Integer airRange) {
    this(groundRange);
    this.airRange = airRange;
  }

}