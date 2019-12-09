package game.interfaces;

import java.util.List;

import game.enums.EUnit;

/**
 * IBuilds
 */
public interface IBuilds {

  public boolean builds(EUnit EUnit);

  public List<EUnit> getBuildableUnits();
  
}