package com.mycompany.starcraft.game.gameobjects;

import com.mycompany.starcraft.game.interfaces.IGameObject;
import com.mycompany.starcraft.game.mechanics.Life;

/**
 * GameObject
 */
public abstract class GameObject {

  public final IGameObject type;
  public final Life life;
  
  public GameObject(IGameObject ofType) {
    this.life = new Life(IGameObject.getLife(ofType));
    this.type = ofType;
  }

}
