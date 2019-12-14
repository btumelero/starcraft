package com.mycompany.starcraft.game.enums;

import com.mycompany.starcraft.game.interfaces.enums.IEArmoredLife;

/**
 * Contains all hp, shield and armor values of armored game objects
 * 
 * @author btume
 */
public enum EArmoredLife implements IEArmoredLife  {
  
  
  // Units

  ADEPT(70, 70, 1), 
  CARRIER(300, 150, 2), 
  COLOSSUS(200, 150, 1), 
  DARK_TEMPLAR(40, 80, 1),
  DISRUPTOR(100, 100, 1), 
  IMMORTAL(200, 100, 1), 
  MOTHERSHIP(350, 350, 2),
  MOTHERSHIP_CORE(130, 60, 1), 
  SENTRY(40, 40, 1),
  STALKER(80, 80, 1), 
  TEMPEST(200, 100, 2), 
  ZEALOT(100, 50, 1),

  // Buildings

  NEXUS(1000, 1000, 1),
  PYLON(200, 200, 1), 
  ASSIMILATOR(300, 300, 1), 
  GATEWAY(500, 500, 1), 
  FORGE(400, 400, 1),
  PHOTON_CANNON(150, 150, 1), 
  SHIELD_BATTERY(150, 150, 1), 
  WARP_GATE(500, 500, 1), 
  CYBERNETICS_CORE(550, 550, 1),
  TWILIGHT_COUNCIL(500, 500, 1), 
  ROBOTICS_FACILITY(450, 450, 1), 
  STARGATE(600, 600, 1), 
  TEMPLAR_ARCHIVES(500, 500, 1),
  DARK_SHRINE(500, 500, 1), 
  ROBOTICS_BAY(500, 500, 1), 
  FLEET_BEACON(500, 500, 1)
  ;

  private int hp, shield, armor;

  @Override
  public int getHp() {
    return hp;
  }

  @Override
  public int getShield() {
    return shield;
  }

  /**
   * @return the armor
   */
  @Override
  public int getArmor() {
    return armor;
  }

  private EArmoredLife(int armor, int hp, int shield) {
    this.armor = armor;
    this.hp = hp;
    this.shield = shield;
  }
  
}