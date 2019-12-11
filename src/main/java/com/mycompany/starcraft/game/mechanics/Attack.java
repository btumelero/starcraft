package com.mycompany.starcraft.game.mechanics;

import com.mycompany.starcraft.game.gameobjects.AirGameObject;
import com.mycompany.starcraft.game.gameobjects.GameObject;
import com.mycompany.starcraft.game.gameobjects.GroundGameObject;
import com.mycompany.starcraft.game.interfaces.IAirAttack;
import com.mycompany.starcraft.game.interfaces.IAttack;
import com.mycompany.starcraft.game.interfaces.IGroundAttack;

/**
 *
 * @author btume
 */
public abstract class Attack {

  private static void attack(IAttack attacker, GameObject attacked, int damage) {
    for (int i = 0; i < attacker.getNumberOfAttacks(); i++) {
      attacked.life.subtract(damage);
    }
  }

  public static void attack(IGroundAttack attacker, GroundGameObject attacked) {
    attack(attacker, attacked, attacker.getGroundAttack());
  }

  public static void attack(IAirAttack attacker, AirGameObject attacked) {
    attack(attacker, attacked, attacker.getAirAttack());
  }

}
