package game.interfaces;

/**
 * IAttack
 */
public interface IAttack {

  public boolean attacksAir ();

  public boolean attacksGround ();

  public int getGroundAttack();
  
  public int getAirAttack();
  
  public Integer getNumberOfAttacks();

}