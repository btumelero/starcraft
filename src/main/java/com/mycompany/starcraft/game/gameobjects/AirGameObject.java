package com.mycompany.starcraft.game.gameobjects;

import com.mycompany.starcraft.game.interfaces.enums.IEGameObject;


/**
 * Air Game Objects have no movement restrictions
 * 
 * @author btume
 */
public abstract class AirGameObject extends GameObject {

  /**
   * Instantiate directly only in test cases where it is not necessary to initialize the entire object correctly
   * @param gameObject Use EAirUnit here
   */
  public AirGameObject(IEGameObject gameObject) {
    super(gameObject);
  }
  
}
