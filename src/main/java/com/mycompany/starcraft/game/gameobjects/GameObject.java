package com.mycompany.starcraft.game.gameobjects;

import com.mycompany.starcraft.game.interfaces.IGameObject;
import com.mycompany.starcraft.game.mechanics.Life;
import com.mycompany.starcraft.game.mechanics.Position;

/**
 * GameObject
 */
public abstract class GameObject {

  public final IGameObject type;
  public final Life life;
  public Position position;
  
  public GameObject(IGameObject ofType) {
    this.type = ofType;
    this.life = new Life(IGameObject.getLife(ofType));
    this.position = new Position();
  }

}
