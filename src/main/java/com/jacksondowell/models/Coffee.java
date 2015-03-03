package com.jacksondowell.models;

public class Coffee {
  
  private final String _name;
  private final double _caffeineContent;
  
  public Coffee(String name, double caffeineContent) {
    _name = name;
    _caffeineContent = caffeineContent;
  }
  
  public String getName() {
    return _name;
  }
  
  public double getCaffeineContent() {
    return _caffeineContent;
  }
  
}
