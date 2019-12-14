package com.mycompany.starcraft.game.mechanics;

import com.mycompany.starcraft.game.gameobjects.AirGameObject;
import com.mycompany.starcraft.game.gameobjects.GameObject;
import com.mycompany.starcraft.game.gameobjects.GroundGameObject;
import com.mycompany.starcraft.game.interfaces.enums.IEAirAttack;
import com.mycompany.starcraft.game.interfaces.enums.IEAttack;
import com.mycompany.starcraft.game.interfaces.enums.IEGroundAttack;

/**
 *
 * @author btume
 */
public abstract class Attack {

  private static void attack(IEAttack attacker, GameObject attacked, int damage) {
    for (int i = 0; i < attacker.getNumberOfAttacks(); i++) {
      attacked.life.subtract(damage);
    }
  }

  public static void attack(IEGroundAttack attacker, GroundGameObject attacked) {
    attack(attacker, attacked, attacker.getGroundAttack());
  }

  public static void attack(IEAirAttack attacker, AirGameObject attacked) {
    attack(attacker, attacked, attacker.getAirAttack());
  }

}
