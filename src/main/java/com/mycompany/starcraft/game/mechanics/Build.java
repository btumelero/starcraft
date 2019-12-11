package com.mycompany.starcraft.game.mechanics;

import com.mycompany.starcraft.game.enums.EAdvancedBuilding;
import com.mycompany.starcraft.game.enums.EAirUnit;
import com.mycompany.starcraft.game.enums.EBasicBuilding;
import com.mycompany.starcraft.game.enums.EGroundUnit;
import com.mycompany.starcraft.game.gameobjects.buildings.AdvancedBuilding;
import com.mycompany.starcraft.game.gameobjects.buildings.BasicBuilding;
import com.mycompany.starcraft.game.gameobjects.units.AirUnit;
import com.mycompany.starcraft.game.gameobjects.units.GroundUnit;
import com.mycompany.starcraft.game.interfaces.IBuild;

/**
 *
 * @author btume
 */
public class Build {

  public AdvancedBuilding build(IBuild builder, EAdvancedBuilding building) {
    if (builder.builds(building)) {
      return new AdvancedBuilding(building);
    }
    return null;
  }

  public BasicBuilding build(IBuild builder, EBasicBuilding building) {
    if (builder.builds(building)) {
      return new BasicBuilding(building);
    }
    return null;
  }
  
  public AirUnit build(IBuild builder, EAirUnit building) {
    if (builder.builds(building)) {
      return new AirUnit(building);
    }
    return null;
  }
  
  public GroundUnit build(IBuild builder, EGroundUnit building) {
    if (builder.builds(building)) {
      return new GroundUnit(building);
    }
    return null;
  }
  
}
