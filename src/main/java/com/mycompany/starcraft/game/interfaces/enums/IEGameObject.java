package com.mycompany.starcraft.game.interfaces.enums;

import com.mycompany.starcraft.game.enums.ECost;
import com.mycompany.starcraft.game.enums.ELife;
import com.mycompany.starcraft.game.interfaces.enums.IECost;
import com.mycompany.starcraft.game.interfaces.enums.IELife;


/**
 * IGameObjects
 */
public interface IEGameObject {
  
  public static IECost getCost(IEGameObject gameObject) {
    return ECost.valueOf(gameObject.getName());
  }
  
  public static IELife getLife(IEGameObject gameObject) {
    return ELife.valueOf(gameObject.getName());
  }
  
  public String getName();
  
}