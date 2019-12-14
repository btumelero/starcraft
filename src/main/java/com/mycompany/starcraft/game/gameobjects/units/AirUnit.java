package com.mycompany.starcraft.game.gameobjects.units;

import com.mycompany.starcraft.game.gameobjects.AirGameObject;
import com.mycompany.starcraft.game.interfaces.classes.IUnit;
import com.mycompany.starcraft.game.interfaces.enums.IEAirUnit;

/**
 * Air units have no movement restrictions
 * 
 * @author btume
 */
public class AirUnit extends AirGameObject implements IUnit {

  @Override
  public void move(int x, int y) {

  }

  /**
   * Instantiate directly only in test cases where it is not necessary to initialize the entire object correctly
   * @param gameObject Use EAirUnit here
   */
  public AirUnit(IEAirUnit unit) {
    super(unit);
  }

}
