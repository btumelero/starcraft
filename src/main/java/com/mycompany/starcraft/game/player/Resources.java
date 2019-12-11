package com.mycompany.starcraft.game.player;

import com.mycompany.starcraft.game.interfaces.ICost;

/**
 *
 * @author btume
 */
public class Resources {

  private int supply, minerals, gas;

  public boolean hasEnoughResources(ICost cost) {
    return (supply - cost.getSupply() >= 0)
      && (minerals - cost.getMinerals() >= 0)
      && (gas - cost.getGas() >= 0);
  }
  
  public void setSupply(int supply) {
    this.supply = supply;
  }

  public void setMinerals(int minerals) {
    this.minerals = minerals;
  }

  public void setGas(int gas) {
    this.gas = gas;
  }

  public int getSupply() {
    return supply;
  }

  public int getMinerals() {
    return minerals;
  }

  public int getGas() {
    return gas;
  }

}
