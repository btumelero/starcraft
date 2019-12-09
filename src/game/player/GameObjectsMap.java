package game.player;

import java.util.HashMap;
import java.util.Map;

import game.gameobjects.GameObject;
import game.interfaces.IGameObject;

/**
 * GameObjects
 */
public class GameObjectsMap {

  private final Map<IGameObject, GameObject> gameObjects;

  public final GameObject get(IGameObject gameObject) {
    return gameObjects.get(gameObject);
  }

  public GameObjectsMap() {
    this.gameObjects = new HashMap<>();
  }
}