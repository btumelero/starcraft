package com.mycompany.starcraft.game.gameobjects;

import com.mycompany.starcraft.game.interfaces.enums.IEGameObject;

/**
 * Ground Game Objects cannot cross water bodies
 * 
 * @author btume
 */
public abstract class GroundGameObject extends GameObject {

  /**
   * Instantiate directly only in test cases where it is not necessary to initialize the entire object correctly
   * @param gameObject Use one of the Enums implementing IEGameObject or its subinterfaces (except EAirUnit) here
   */
  public GroundGameObject(IEGameObject gameObject) {
    super(gameObject);
  }
  
}
