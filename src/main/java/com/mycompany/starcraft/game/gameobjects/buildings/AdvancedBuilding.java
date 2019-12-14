package com.mycompany.starcraft.game.gameobjects.buildings;

import com.mycompany.starcraft.game.gameobjects.GroundGameObject;
import com.mycompany.starcraft.game.interfaces.enums.IEAdvancedBuilding;

/**
 * Advanced buildings require other buildings to be built before they can be unlocked.
 * 
 * @author btume
 */
public class AdvancedBuilding extends GroundGameObject {

  /**
   * Instantiate directly only in test cases where it is not necessary to initialize the entire object correctly
   * @param building Use EAdvancedBuilding here
   */
  public AdvancedBuilding(IEAdvancedBuilding building) {
    super(building);
  }
  
}
