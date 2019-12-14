package com.mycompany.starcraft.game.gameobjects.units;

import com.mycompany.starcraft.game.gameobjects.GroundGameObject;
import com.mycompany.starcraft.game.interfaces.classes.IUnit;
import com.mycompany.starcraft.game.interfaces.enums.IEUnit;

/**
 *
 * @author btume
 */
public class GroundUnit extends GroundGameObject implements IUnit {

  @Override
  public void move(int x, int y) {

  }

  public GroundUnit(IEUnit unit) {
    super(unit);
  }

}
