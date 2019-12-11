package com.mycompany.starcraft.game.player;

import com.mycompany.starcraft.game.gameobjects.GameObject;
import com.mycompany.starcraft.game.gameobjects.buildings.AdvancedBuilding;
import com.mycompany.starcraft.game.gameobjects.buildings.BasicBuilding;
import com.mycompany.starcraft.game.gameobjects.units.AirUnit;
import com.mycompany.starcraft.game.gameobjects.units.GroundUnit;
import com.mycompany.starcraft.game.interfaces.IBuilding;
import com.mycompany.starcraft.game.interfaces.IGameObject;
import com.mycompany.starcraft.game.interfaces.IUnit;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * GameObjects
 */
public class GameObjectsMap {

  private final Map<Class, Map<IGameObject, List<GameObject>>> gameObjects;

  public List<? extends GameObject> get(IGameObject type) {
    return gameObjects.get(type.getClass()).get(type);
  }

  public IBuilding getAsBuilding(int i, IBuilding type) {
    return (IBuilding) get(type).get(i);
  }

  public IUnit getAsUnit(int i, IUnit type) {
    return (IUnit) get(type).get(i);
  }

  public void add(GameObject gameObject) {
    var mapOfGameObjectClass = gameObjects.get(gameObject.getClass());
    if (mapOfGameObjectClass.containsKey(gameObject.type) == false) {
      mapOfGameObjectClass.put(gameObject.type, new ArrayList<>());
    }
    mapOfGameObjectClass.get(gameObject.type).add(gameObject);
  }

  public Set<Class> keySet() {
    return Set.copyOf(gameObjects.keySet());
  }

  public GameObjectsMap() {
    this.gameObjects = new HashMap<>();
    this.gameObjects.put(AdvancedBuilding.class, new HashMap<>());
    this.gameObjects.put(BasicBuilding.class, new HashMap<>());
    this.gameObjects.put(AirUnit.class, new HashMap<>());
    this.gameObjects.put(GroundUnit.class, new HashMap<>());
  }
}
