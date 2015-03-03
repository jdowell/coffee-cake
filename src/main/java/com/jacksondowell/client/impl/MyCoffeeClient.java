package com.jacksondowell.client.impl;

import com.jacksondowell.client.CoffeeClient;
import com.jacksondowell.models.Coffee;
import java.util.Collections;
import java.util.List;


public class MyCoffeeClient implements CoffeeClient {
  @Override
  public List<Coffee> findCoffeesByCaffeineLevel(double lowest, double highest) {
    // I'm really more of a tea person
    return Collections.emptyList();
  }
}
