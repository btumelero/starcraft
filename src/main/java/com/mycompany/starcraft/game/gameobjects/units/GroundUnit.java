package com.mycompany.starcraft.game.gameobjects.units;

import com.mycompany.starcraft.game.gameobjects.GroundGameObject;
import com.mycompany.starcraft.game.interfaces.classes.IUnit;
import com.mycompany.starcraft.game.interfaces.enums.IEGroundUnit;

/**
 * Ground Units cannot cross water bodies
 * 
 * @author btume
 */
public class GroundUnit extends GroundGameObject implements IUnit {

  @Override
  public void move(int x, int y) {

  }

  /**
   * Instantiate directly only in test cases where it is not necessary to initialize the entire object correctly
   * @param unit Use EGroundUnit here
   */
  public GroundUnit(IEGroundUnit unit) {
    super(unit);
  }

}
