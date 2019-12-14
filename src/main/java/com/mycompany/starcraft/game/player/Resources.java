package com.mycompany.starcraft.game.player;

import com.mycompany.starcraft.game.interfaces.enums.IECost;

/**
 *
 * @author btume
 */
public class Resources {

  private int supply, minerals, gas;

  public boolean hasEnoughResources(IECost cost) {
    return (minerals - cost.getMinerals() >= 0) && (gas - cost.getGas() >= 0);
  }

  public boolean hasSuppliesAvailable(IECost cost) {
    return supply - cost.getSupply() >= 0;
  }

  public void updateSupply(int value) {
    this.supply += value;
  }

  public void subtractMinerals(int value) {
    this.minerals += value;
  }

  public void subtractGas(int value) {
    this.gas += value;
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

  /**
   * Instantiate directly only in test cases where it is not necessary to initialize the entire object correctly
   * @param gas Use positive values
   * @param minerals Use positive values
   * @param supply Use positive values
   */
  public Resources(int gas, int minerals, int supply) {
    this.gas = gas;
    this.minerals = minerals;
    this.supply = supply;
  }

}
