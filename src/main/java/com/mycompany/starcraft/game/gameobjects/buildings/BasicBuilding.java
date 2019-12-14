package com.mycompany.starcraft.game.gameobjects.buildings;

import com.mycompany.starcraft.game.gameobjects.GroundGameObject;
import com.mycompany.starcraft.game.interfaces.enums.IEBasicBuilding;

/**
 * Basic buildings are available from the start of the game.
 * 
 * @author btume
 */
public class BasicBuilding extends GroundGameObject {

  /**
   * Instantiate directly only in test cases where it is not necessary to initialize the entire object correctly
   * @param building Use EBasicBuilding here
   */
  public BasicBuilding(IEBasicBuilding building) {
    super(building);
  }
  
}
