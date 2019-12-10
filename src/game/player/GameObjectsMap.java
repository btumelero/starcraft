package game.player;

import java.util.HashMap;
package game.player;

import game.gameobjects.Building;
import game.gameobjects.GameObject;
import game.gameobjects.Unit;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * GameObjects
 */
public class GameObjectsMap {

  private final Map<Class, List<GameObject>> gameObjects;

  public List<? extends GameObject> get(Class<? extends GameObject> type) {
    return gameObjects.get(type);
  }

  public Building getAsBuilding(int i, Class<? extends Building> type) {
    return (Building) get(type).get(i);
  }
  
  public Unit getAsUnit(int i, Class<? extends Unit> type) {
    return (Unit) get(type).get(i);
  }

  public void add(GameObject gameObject) {
    if (gameObjects.containsKey(gameObject.getClass()) == false) {
      gameObjects.put(gameObject.getClass(), new ArrayList<>());
    }
    gameObjects.get(gameObject.getClass()).add(gameObject);
  }

  public Set<Class> keySet() {
    return gameObjects.keySet();
  }

  public GameObjectsMap() {
    this.gameObjects = new HashMap<>();
  }
}
