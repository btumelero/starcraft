package game.enums;

/**
 * Speed
 */
public enum Speed {

  ADEPT(3.5), 
  ARCHON(3.94), 
  CARRIER(2.62), 
  COLOSSUS(3.15),
  DARK_TEMPLAR(3.94),
  DISRUPTOR(3.15),
  HIGH_TEMPLAR(2.62),
  IMMORTAL(3.15),
  INTERCEPTOR(10.5),
  MOTHERSHIP(2.62),
  MOTHERSHIP_CORE(2.62),
  OBSERVER(2.63),
  ORACLE(5.6),
  PHOENIX(5.95),
  PROBE(3.94),
  SENTRY(3.15),
  STALKER(4.13),
  TEMPEST(3.15),
  VOID_RAY(3.5),
  WRAP_PRISM(4.13),
  ZEALOT(3.15)

  ;

  private double speed;

  /**
   * @return the speed
   */
  public double getSpeed() {
    return speed;
  }

  private Speed(double speed) {
    this.speed = speed;
  }

}