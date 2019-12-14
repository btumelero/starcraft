package com.mycompany.starcraft.game.gameobjects;

import com.mycompany.starcraft.game.interfaces.enums.IEGameObject;
import com.mycompany.starcraft.game.mechanics.Life;
import com.mycompany.starcraft.game.mechanics.Position;

/**
 * GameObject
 */
public abstract class GameObject {

  public final IEGameObject type;
  public final Life life;
  public Position position;
  
  public GameObject(IEGameObject ofType) {
    this.type = ofType;
    this.life = new Life(IEGameObject.getLife(ofType));
    this.position = new Position();
  }

}
