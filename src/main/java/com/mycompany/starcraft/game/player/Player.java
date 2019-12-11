package com.mycompany.starcraft.game.player;

import com.mycompany.starcraft.game.gameobjects.GameObject;
import com.mycompany.starcraft.game.interfaces.IAttack;
import com.mycompany.starcraft.game.mechanics.Attack;

/**
 * Player
 */
public class Player {
  
  private final GameObjectsMap gameObjects;
  private final Resources resources;
  
  public final void attack (IAttack attacker, GameObject attacked) {
    Attack.attack(attacker, attacked);
  }
  
  public Player() {
    this.gameObjects = new GameObjectsMap();
    this.resources = new Resources();
  }
  
}