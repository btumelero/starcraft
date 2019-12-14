package com.mycompany.starcraft.instantiator;

import com.mycompany.starcraft.game.gameobjects.buildings.AdvancedBuilding;
import com.mycompany.starcraft.game.gameobjects.buildings.BasicBuilding;
import com.mycompany.starcraft.game.gameobjects.units.AirUnit;
import com.mycompany.starcraft.game.gameobjects.units.GroundUnit;
import com.mycompany.starcraft.game.interfaces.enums.IEAdvancedBuilding;
import com.mycompany.starcraft.game.interfaces.enums.IEAirUnit;
import com.mycompany.starcraft.game.interfaces.enums.IEArmoredLife;
import com.mycompany.starcraft.game.interfaces.enums.IEBasicBuilding;
import com.mycompany.starcraft.game.interfaces.enums.IEGroundUnit;
import com.mycompany.starcraft.game.interfaces.enums.IELife;
import com.mycompany.starcraft.game.mechanics.ArmoredLife;
import com.mycompany.starcraft.game.mechanics.Life;
import com.mycompany.starcraft.game.mechanics.Position;
import com.mycompany.starcraft.game.player.GameObjectsMap;
import com.mycompany.starcraft.game.player.Player;
import com.mycompany.starcraft.game.player.Resources;

/**
 * @author btume
 */
public abstract class Instantiate {

  /**
   * Returns an AdvancedBuilding of the given type or null
   * @param advancedBuilding Use EAdvancedBuilding to choose an AdvancedBuilding
   * @return An AdvancedBuilding if the given argument(s) is(are) valid (not null)
   */
  public static AdvancedBuilding advancedBuilding(IEAdvancedBuilding advancedBuilding) {
    return advancedBuilding != null ? new AdvancedBuilding(advancedBuilding) : null;
  }

  /**
   * Returns a BasicBuilding of the given type or null
   * @param basicBuilding Use EBasicBuilding to choose a BasicBuilding
   * @return A BasicBuilding if the given argument(s) is(are) valid (not null)
   */
  public static BasicBuilding basicBuilding(IEBasicBuilding basicBuilding) {
    return basicBuilding != null ? new BasicBuilding(basicBuilding) : null;
  }

  /**
   * Returns an AirUnit of the given type or null
   * @param airUnit Use EAirUnit to choose an AirUnit
   * @return An AirUnit if the given argument(s) is(are) valid (not null)
   */
  public static AirUnit airUnit(IEAirUnit airUnit) {
    return airUnit != null ? new AirUnit(airUnit) : null;
  }

  /**
   * Returns a GroundUnit of the given type or null
   * @param groundUnit Use EGroundUnit to choose a GroundUnit
   * @return A GroundUnit if the given argument(s) is(are) valid (not null)
   */
  public static GroundUnit groundUnit(IEGroundUnit groundUnit) {
    return groundUnit != null ? new GroundUnit(groundUnit) : null;
  }

  /**
   * Returns an ArmoredLife of the given type or null
   * @param armoredLife Use EArmoredLife to choose an ArmoredLife
   * @return An ArmoredLife if the given argument(s) is(are) valid (not null)
   */
  public static ArmoredLife armoredLife(IEArmoredLife armoredLife) {
    return armoredLife != null ? new ArmoredLife(armoredLife) : null;
  }

  /**
   * Returns a Life of the given type or null
   * @param life Use ELife to choose a Life
   * @return A Life if the given argument(s) is(are) valid (not null)
   */
  public static Life life(IELife life) {
    return life != null ? new Life(life) : null;
  }

  /**
   * Returns a Position or null
   * @param x The X position
   * @param y The Y position
   * @return A Position if the given argument(s) is(are) valid (x and y within map bounds)
   */
  public static Position position(int x, int y) {
    return Position.isValid(x, y) ? new Position(x, y) : null;
  }

  /**
   * Returns a empty Position. For initial buildings and units only.
   * @return A empty Position
   */
  public static Position position() {
    return new Position();
  }

  /**
   * Returns a GameObjectsMap
   * @return A GameObjectsMap
   */
  public static GameObjectsMap gameObjectsMap() {
    return new GameObjectsMap();
  }

  /**
   * Returns a Player
   * @return A Player
   */
  public static Player player() {
    return new Player();
  }

  /**
   * Returns a Resources or null
   * @param gas The gas amount
   * @param minerals The minerals amount
   * @param supply The supply amount
   * @return A Resources if the given argument(s) is(are) valid (gas, minerals and supply higher or equal to zero)
   */
  public static Resources resources(int gas, int minerals, int supply) {
    return gas >= 0 && minerals >= 0 && supply >= 0 ? new Resources(gas, minerals, supply) : null;
  }

}