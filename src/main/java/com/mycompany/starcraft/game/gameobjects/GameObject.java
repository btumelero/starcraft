package com.mycompany.starcraft.game.gameobjects;

import com.mycompany.starcraft.game.interfaces.enums.IEGameObject;
import com.mycompany.starcraft.game.mechanics.Life;
import com.mycompany.starcraft.game.mechanics.Position;
import com.mycompany.starcraft.instantiator.Instantiate;

/**
 * Game Objects that the player can create during the game.
 * 
 * @author btume
 */
public abstract class GameObject {

  public final IEGameObject type;
  public final Life life;
  public Position position;
  
  /**
   * Instantiate directly only in test cases where it is not necessary to initialize the entire object correctly
   * @param ofType Use one of the Enums implementing IEGameObject or its subinterfaces here
   */
  public GameObject(IEGameObject ofType) {
    this.type = ofType;
    this.life = Instantiate.life(IEGameObject.getLife(ofType));
    this.position = Instantiate.position();
  }

}
