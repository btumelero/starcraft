package game.enums;

import game.interfaces.IAttack;
import game.interfaces.IGameObject;
import java.util.Set;

/**
 * Attack
 */
public enum EAttack implements IAttack {

  //Units

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
  PROBE(6, 6),
  SENTRY(30, 30),
  STALKER(6, 6),
  TEMPEST(40, 30),
  VOID_RAY(6, 6),
  ZEALOT(8, 0, 2),
  
  //Buildings

  PHOTON_CANNON(20, 20),
  PYLON(5, 0),

  ;

  private static Set<String> values = Set.of(EnumUtils.getStringValues(EAttack.class));
  
  private int groundAttack, airAttack;
  private Integer numberOfAttacks;

  public static boolean contains (IGameObject gameObject) {
    return values.contains(gameObject.getName());
  }
  
  @Override
  public boolean attacksAir () {
    return getAirAttack() != 0;
  }

  @Override
  public boolean attacksGround () {
    return getGroundAttack() != 0;
  }

  /**
   * @return the ground attack
   */
  @Override
  public int getGroundAttack() {
    return groundAttack;
  }

  /**
   * @return the air attack
   */
  @Override
  public int getAirAttack() {
    return airAttack;
  }
  
  /**
   * @return the numberOfAttacks
   */
  @Override
  public Integer getNumberOfAttacks() {
    return numberOfAttacks;
  }

  private EAttack(int groundAttack, int airAttack) {
    this.groundAttack = groundAttack;
    this.airAttack = airAttack;
  }

  private EAttack(int groundAttack, int airAttack, Integer numberOfAttacks) {
    this(groundAttack, airAttack);
    this.numberOfAttacks = numberOfAttacks;
  }

}