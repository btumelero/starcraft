package game.enums;

/**
 * Range
 */
public enum Range {

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
  PHOTON_CANNON(7),
  PROBE(5),
  PYLON(0),
  SENTRY(7),
  STALKER(5),
  TEMPEST(10, 14),
  VOID_RAY(6),
  ZEALOT(0)

  ;

  private int groundRange;
  private Integer airRange;

  /**
   * @return the range
   */
  public int getRange() {
    return groundRange;
  }

  public Integer getAirRange () {
    return airRange;
  }
  
  private Range(int range) {
    this.groundRange = range;
  }
  
  private Range(int groundRange, Integer airRange) {
    this(groundRange);
    this.airRange = airRange;
  }

}