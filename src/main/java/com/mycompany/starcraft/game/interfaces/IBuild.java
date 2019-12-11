package com.mycompany.starcraft.game.interfaces;

import java.util.List;

/**
 * IBuilds
 */
public interface IBuild {

  public boolean builds(IGameObject gameObject);

  public List<IGameObject> getBuildableGameObjects();
  
}