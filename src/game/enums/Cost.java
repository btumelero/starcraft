package game.enums;

/**
 * Supply
 */
public enum Cost {

  //Units

  ADEPT(50, 0, 2), 
  ARCHON(0, 0, 4), 
  CARRIER(350, 250, 6), 
  COLOSSUS(300, 200, 6), 
  DARK_TEMPLAR(125, 125, 2), 
  DISRUPTOR(150, 150, 3), 
  HIGH_TEMPLAR(50, 150, 2), 
  IMMORTAL(250, 100, 4), 
  INTERCEPTOR(15, 0, 0), 
  MOTHERSHIP(400, 400, 8), 
  MOTHERSHIP_CORE(100, 100, 2), 
  OBSERVER(25, 75, 1), 
  ORACLE(150, 150, 3), 
  PHOENIX(150, 100, 2), 
  PROBE(50, 0, 1), 
  SENTRY(50, 100, 2), 
  STALKER(125, 50, 2), 
  TEMPEST(250, 175, 5), 
  VOID_RAY(250, 150, 4), 
  WRAP_PRISM(200, 0, 2), 
  ZEALOT(100, 0, 2),
  
  //Buildings
  
  NEXUS(400, 0),
  PYLON(100, 0), 
  ASSIMILATOR(75, 0),
  GATEWAY(150, 0),
  FORGE(150, 0),
  PHOTON_CANNON(150, 0), 
  SHIELD_BATTERY(100, 0),
  WARP_GATE(0, 0),
  CYBERNETICS_CORE(150, 0),
  TWILIGHT_COUNCIL(150, 100),
  ROBOTICS_FACILITY(150, 100),
  STARGATE(150, 150),
  TEMPLAR_ARCHIVES(150, 200),
  DARK_SHRINE(150, 150),
  ROBOTICS_BAY(150, 150),
  FLEET_BEACON(300, 200)
  
  ;

  private Integer supply;
  private int minerals, gas;

  public Integer getSupply() {
    return supply;
  }

  public int getMinerals() {
    return minerals;
  }

  public int getGas() {
    return gas;
  }

  private Cost(int minerals, int gas) {
    this.minerals = minerals;
    this.gas = gas;
  }

  private Cost(int minerals, int gas, Integer supply) {
    this(minerals, gas);
    this.supply = supply;
  }
  
}