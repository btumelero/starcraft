package com.mycompany.starcraft.game.gameobjects.units;

import com.mycompany.starcraft.game.gameobjects.AirGameObject;
import com.mycompany.starcraft.game.interfaces.classes.IUnit;
import com.mycompany.starcraft.game.interfaces.enums.IEUnit;

/**
 *
 * @author btume
 */
public class AirUnit extends AirGameObject implements IUnit{
  
  @Override
  public void move(int x, int y) {
    
  }
  
  
    public AirUnit(IEUnit unit) {
      super(unit);
    }
}
