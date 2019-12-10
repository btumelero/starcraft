package game.interfaces;

import game.enums.ECost;
import game.enums.ELife;

/**
 * IGameObjects
 */
public interface IGameObject {
  
  public static ICost getCost(IGameObject gameObject) {
    return ECost.valueOf(gameObject.getName());
  }
  
  public static ILife getLife(IGameObject gameObject) {
    return ELife.valueOf(gameObject.getName());
  }
  
  public String getName();
  
}