package com.jacksondowell.models;

/**
 * A simple data model to represent Coffee
 */
public class Coffee {
  
  private final String _name;
  private final double _caffeineContent;
  
  public Coffee(String name, double caffeineContent) {
    _name = name;
    _caffeineContent = caffeineContent;
  }

  /**
   * @return the name of the coffee
   */
  public String getName() {
    return _name;
  }

  /**
   * @return the caffeine content as a double (1.0 = 100% caffeine, 0.0 = 0% caffeine)
   */
  public double getCaffeineContent() {
    return _caffeineContent;
  }
  
}
