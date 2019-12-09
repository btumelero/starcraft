package game.enums;

/**
 * Attack
 */
public enum Attack {

  ADEPT(10, 0), 
  ARCHON(25, 25),
  COLOSSUS(10, 0, 2),
  DARK_TEMPLAR(45, 0),
  HIGH_TEMPLAR(4, 0),
  IMMORTAL(20, 0),
  INTERCEPTOR(5, 5, 2),
  MOTHERSHIP(6, 6, 6),
  MOTHERSHIP_CORE(8, 0),
  ORACLE(15, 0),
  PHOENIX(0, 5, 2),
  PHOTON_CANNON(20, 20),
  PROBE(6, 6),
  PYLON(5, 0),
  SENTRY(30, 30),
  STALKER(6, 6),
  TEMPEST(40, 30),
  VOID_RAY(6, 6),
  ZEALOT(8, 0, 2)

  ;

  private int groundAttack, airAttack;
  private Integer numberOfAttacks;

  public boolean attacksAir () {
    return getAirAttack() != 0;
  }

  public boolean attacksGround () {
    return getGroundAttack() != 0;
  }

  /**
   * @return the ground attack
   */
  public int getGroundAttack() {
    return groundAttack;
  }

  /**
   * @return the air attack
   */
  public int getAirAttack() {
    return airAttack;
  }
  
  /**
   * @return the numberOfAttacks
   */
  public Integer getNumberOfAttacks() {
    return numberOfAttacks;
  }

  private Attack(int groundAttack, int airAttack) {
    this.groundAttack = groundAttack;
    this.airAttack = airAttack;
  }

  private Attack(int groundAttack, int airAttack, Integer numberOfAttacks) {
    this(groundAttack, airAttack);
    this.numberOfAttacks = numberOfAttacks;
  }
}