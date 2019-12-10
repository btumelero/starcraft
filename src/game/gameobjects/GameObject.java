package game.gameobjects;

import game.interfaces.IGameObject;
import game.mechanics.Life;
/**
 * GameObject
 */
public abstract class GameObject {

  public final IGameObject gameObject;
  public final Life life;
  
  public GameObject(IGameObject gameObject) {
    this.life = new Life(IGameObject.getLife(gameObject));
    this.gameObject = gameObject;
  }

}
