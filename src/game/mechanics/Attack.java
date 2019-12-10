package game.mechanics;

import game.gameobjects.GameObject;
import game.interfaces.IAttack;
import game.interfaces.IGameObject;
import game.interfaces.IUnit;

/**
 *
 * @author btume
 */
public class Attack {

  public boolean attack(IAttack attacker, GameObject attacked) {
    if (attacked.gameObject instanceof IUnit) {
      if (canHit(attacker, (IUnit) attacked.gameObject) == false) {
        return false;
      }
    } 
    int dano = getAttack(attacker, attacked.gameObject);
    for (int i = 0; i < attacker.getNumberOfAttacks(); i++) {
      if (attacked.life.getShield() > 0) {
        attacked.life.subtract(dano);
      }
    }
    return true;
  }

  private boolean canHit(IAttack attacker, IUnit attackedUnit) {
    return (attackedUnit.flies() && attacker.attacksAir()) || (attackedUnit.flies() == false && attacker.attacksGround());
  }

  private int getAttack(IAttack attacker, IGameObject attacked) {
    if (attacked instanceof IUnit) {
      if (((IUnit) attacked).flies()) {
        return attacker.getAirAttack();
      }
    }
    return attacker.getGroundAttack();
  }

}
