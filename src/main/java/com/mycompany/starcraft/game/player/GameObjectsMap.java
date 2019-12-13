package com.mycompany.starcraft.game.player;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.mycompany.starcraft.game.gameobjects.GameObject;
import com.mycompany.starcraft.game.gameobjects.buildings.AdvancedBuilding;
import com.mycompany.starcraft.game.gameobjects.buildings.BasicBuilding;
import com.mycompany.starcraft.game.gameobjects.units.AirUnit;
import com.mycompany.starcraft.game.gameobjects.units.GroundUnit;
import com.mycompany.starcraft.game.interfaces.IBuilding;
import com.mycompany.starcraft.game.interfaces.IGameObject;
import com.mycompany.starcraft.game.interfaces.IUnit;

/**
 * GameObjectsMap:
 * 
 * Composite key map that stores the player's objects. It work as follows:
 * 
 * ______________________________________________________________________
 * |PRIMARY KEY.....|SECONDARY KEY|VALUE................................|
 * |----------------|-------------|-------------------------------------|
 * |AdvancedBuilding|DARK_SHRINE..|List of Dark Shrines.................|
 * |................|FLEET_BEACON.|List of Fleet Beacons................|
 * |................|ROBOTICS_BAY.|List of Robotics Bays................|
 * |................|.............|.....................................|
 * |BasicBuilding...|ASSIMILATOR..|List of Assimilators.................|
 * |................|.............|.....................................|
 * |AirUnit.........|CARRIER......|List of Carriers.....................|
 * |................|.............|.....................................|
 * |GroundUnit......|ADEPT........|List of Adepts.......................|
 * |................|.............|.....................................|
 * |____________________________________________________________________|
 */
public class GameObjectsMap {

  @SuppressWarnings("rawtypes")
  private final Map<Class, Map<IGameObject, List<GameObject>>> gameObjects;

  /**
   * Returns a list with all game objects of the specified type.
   * 
   * @param type The type of the game objects list to be returned. Use any of the
   *             following enums to get the lists: EBasicBuilding,
   *             EAdvancedBuilding, EAirUnit or EGroundUnit.
   * @return The List of the speciefied type.
   */
  public List<? extends GameObject> get(IGameObject type) {
    return gameObjects.get(type.getClass()).get(type);
  }

  /**
   * Returns the specified building from its list.
   * 
   * @param i    The specific building in the list to be returned.
   * @param type The type of the building to be returned. The EBasicBuilding or
   *             EAdvancedBuild enums must be used here.
   * @return A game object already cast to IBuilding.
   */
  public IBuilding getAsBuilding(int i, IBuilding type) {
    return (IBuilding) get(type).get(i);
  }

  /**
   * Returns the specified unit from its list.
   * 
   * @param i    The specific unit in the list to be returned.
   * @param type The type of the unit to be returned.
   * @returnA game object already cast to IUnit.
   */
  public IUnit getAsUnit(int i, IUnit type) {
    return (IUnit) get(type).get(i);
  }

  /**
   * Adds the game object to the player's game objects.
   * @param gameObject The game object to be added to the player's gameObjectsMap.
   * @return True if the object was added to to the player's gameObjectsMap
   */
  public boolean add(GameObject gameObject) {
    var mapOfGameObjectClass = gameObjects.get(gameObject.getClass());
    if (mapOfGameObjectClass.containsKey(gameObject.type) == false) {
      mapOfGameObjectClass.put(gameObject.type, new ArrayList<>());
    }
    return mapOfGameObjectClass.get(gameObject.type).add(gameObject);
  }

  public void remove(GameObject gameObject) {
    var mapOfGameObjectClass = gameObjects.get(gameObject.getClass());
    if (mapOfGameObjectClass.containsKey(gameObject.type)) {
      mapOfGameObjectClass.get(gameObject.type).remove(gameObject);
    }
  }

  @SuppressWarnings("rawtypes")
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
