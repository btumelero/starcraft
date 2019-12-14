package com.mycompany.starcraft.game.enums;

import java.util.List;

import com.mycompany.starcraft.game.interfaces.enums.IEAdvancedBuilding;
import com.mycompany.starcraft.game.interfaces.enums.IEBuilding;
import com.mycompany.starcraft.game.player.GameObjectsMap;

/**
 * Contains all Advanced Buildings and its building requeriments
 * 
 * @author btume
 */
public enum EAdvancedBuilding implements IEAdvancedBuilding {

  ROBOTICS_FACILITY(EBasicBuilding.CYBERNETICS_CORE),
  ROBOTICS_BAY(EBasicBuilding.CYBERNETICS_CORE, EAdvancedBuilding.ROBOTICS_FACILITY),
  STARGATE(EBasicBuilding.CYBERNETICS_CORE), FLEET_BEACON(EAdvancedBuilding.STARGATE, EBasicBuilding.CYBERNETICS_CORE),
  TWILIGHT_COUNCIL(EBasicBuilding.CYBERNETICS_CORE),
  DARK_SHRINE(EBasicBuilding.CYBERNETICS_CORE, EAdvancedBuilding.TWILIGHT_COUNCIL),
  TEMPLAR_ARCHIVES(EBasicBuilding.CYBERNETICS_CORE, EAdvancedBuilding.TWILIGHT_COUNCIL),
  WARP_GATE(EBasicBuilding.CYBERNETICS_CORE),

  ;

  private final List<IEBuilding> requiredBuildings;

  @Override
  public boolean hasRequiredBuildings(GameObjectsMap gameObjectsMap) {
    for (int i = 0; i < requiredBuildings.size(); i++) {
      if (gameObjectsMap.keyExists(requiredBuildings.get(i))) {
        return false;
      }
      if (gameObjectsMap.get(requiredBuildings.get(i)).size() == 0) {
        return false;
      }
    }
    return true;
  }

  @Override
  public String getName() {
    return this.name();
  }

  private EAdvancedBuilding(IEBuilding... requiredBuildings) {
    this.requiredBuildings = List.of(requiredBuildings);
  }

}
