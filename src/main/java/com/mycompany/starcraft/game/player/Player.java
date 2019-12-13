package com.mycompany.starcraft.game.player;

import com.mycompany.starcraft.game.enums.ECost;
import com.mycompany.starcraft.game.gameobjects.GameObject;
import com.mycompany.starcraft.game.interfaces.ICost;

/**
 * Player
 */
public class Player {
  
  private final GameObjectsMap gameObjects;
  private final Resources resources;

  public void addToGameObjects(GameObject gameObject) {
    ICost cost = ECost.costOf(gameObject.type);
    if (resources.hasEnoughResources(cost)) {
      if (resources.hasSuppliesAvailable(cost)) {
        resources.updateSupply(cost.getSupply());
        resources.subtractGas(cost.getGas());
        resources.subtractMinerals(cost.getMinerals());
        gameObjects.add(gameObject);
      }
    }
  }

  public Player() {
    this.gameObjects = new GameObjectsMap();
    this.resources = new Resources(300,300, 20);
  }
  
}