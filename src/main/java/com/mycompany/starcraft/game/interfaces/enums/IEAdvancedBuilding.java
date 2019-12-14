package com.mycompany.starcraft.game.interfaces.enums;

import com.mycompany.starcraft.game.player.GameObjectsMap;

/**
 *
 * @author btume
 */
public interface IEAdvancedBuilding extends IEBuilding {
 
  public boolean hasRequiredBuildings (GameObjectsMap gameObjectsMap);

}
