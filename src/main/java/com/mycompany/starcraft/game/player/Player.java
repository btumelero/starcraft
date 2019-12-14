package com.mycompany.starcraft.game.player;

import com.mycompany.starcraft.game.enums.ECost;
import com.mycompany.starcraft.game.gameobjects.GameObject;
import com.mycompany.starcraft.game.interfaces.enums.IECost;

/**
 * 
 * @author btume
 */
public class Player {
  
  private final GameObjectsMap gameObjects;
  private final Resources resources;

  public boolean addToGameObjects(GameObject gameObject) {
    IECost cost = ECost.costOf(gameObject.type);
    if (resources.hasEnoughResources(cost)) {
      if (resources.hasSuppliesAvailable(cost)) {
        resources.updateSupply(cost.getSupply());
        resources.subtractGas(cost.getGas());
        resources.subtractMinerals(cost.getMinerals());
        return gameObjects.add(gameObject);
      }
    }
    return false;
  }

  /**
   * Instantiate directly only in test cases where it is not necessary to initialize the entire object correctly
   */
  public Player() {
    this.gameObjects = new GameObjectsMap();
    this.resources = new Resources(300,300, 20);
  }
  
}