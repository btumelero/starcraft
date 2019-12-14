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
import com.mycompany.starcraft.game.interfaces.enums.IEBuilding;
import com.mycompany.starcraft.game.interfaces.enums.IEGameObject;
import com.mycompany.starcraft.game.interfaces.enums.IEUnit;

/**
 * GameObjectsMap:
 * 
 * Composite key HashMap that stores the player's objects. It work as follows:
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
  private final Map<Class, Map<IEGameObject, List<GameObject>>> gameObjects;

  /**
   * Returns a list with all game objects of the specified type.
   * 
   * @param type The type of the game objects list to be returned. Use any of the
   *             following enums to get the lists: EBasicBuilding,
   *             EAdvancedBuilding, EAirUnit or EGroundUnit.
   * @return The List of the speciefied type.
   */
  public List<GameObject> get(IEGameObject type) {
    return getInternalMap(type.getClass()).get(type);
  }

  @SuppressWarnings("rawtypes")
  private Map<IEGameObject, List<GameObject>> getInternalMap(Class gameObjectClass) {
    return gameObjects.get(gameObjectClass);
  }

  /**
   * Returns the specified building from its list.
   * 
   * @param i    The specific building in the list to be returned.
   * @param type The type of the building to be returned. The EBasicBuilding or
   *             EAdvancedBuild enums must be used here.
   * @return A game object already cast to IBuilding.
   */
  public IEBuilding getAsBuilding(int i, IEBuilding type) {
    return (IEBuilding) get(type).get(i);
  }

  /**
   * Returns the specified unit from its list.
   * 
   * @param i    The specific unit in the list to be returned.
   * @param type The type of the unit to be returned.
   * @returnA game object already cast to IUnit.
   */
  public IEUnit getAsUnit(int i, IEUnit type) {
    return (IEUnit) get(type).get(i);
  }

  /**
   * Adds the game object to the player's game objects.
   * 
   * @param gameObject The game object to be added to the player's gameObjectsMap.
   * @return True if the object was added to the player's gameObjectsMap
   */
  public boolean add(GameObject gameObject) {
    if (keyExists(gameObject.type) == false) {
      getInternalMap(gameObject.type.getClass()).put(gameObject.type, new ArrayList<>());
    }
    return get(gameObject.type).add(gameObject);
  }

  /**
   * Removes the game object from the player's game objects
   * 
   * @param gameObject The game object to be removed from the player's
   *                   gameObjectsMap
   * @return True if the object was removed from the player's gameObjectsMap
   */
  public boolean remove(GameObject gameObject) {
    if (keyExists(gameObject.type)) {
      return get(gameObject.type).remove(gameObject);
    }
    return false;
  }

  /**
   * Returns true if the player's gameObjectsMap contains the specified key
   * 
   * @param gameObject The key to be checked
   * @return True if the gameObjectsMap contains the specified key
   */
  public boolean keyExists(IEGameObject gameObject) {
    return gameObjects.get(gameObject.getClass()).containsKey(gameObject);
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
