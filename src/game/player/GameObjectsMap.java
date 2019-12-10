package game.player;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import game.gameobjects.GameObject;

/**
 * GameObjects
 */
public class GameObjectsMap {

  private final Map<Class<GameObject>, List<GameObject>> gameObjects;

  public List<? extends GameObject> get(Class<GameObject> type) {
    return gameObjects.get(type);
  }

  public void put(GameObject gameObject) {
    gameObjects.get(gameObject.getClass()).add(gameObject);
  }

  public GameObjectsMap() {
    this.gameObjects = new HashMap<>();
  }
}