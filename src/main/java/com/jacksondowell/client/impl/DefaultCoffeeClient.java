package com.jacksondowell.client.impl;

import com.jacksondowell.client.CoffeeClient;
import com.jacksondowell.client.DBClient;
import com.jacksondowell.models.Coffee;
import java.util.List;


public class DefaultCoffeeClient implements CoffeeClient {

  private final DBClient _dbClient;

  public DefaultCoffeeClient(DBClient dbClient) {
    _dbClient = dbClient;
  }

  @Override
  public List<Coffee> findCoffeesByCaffeineLevel(double lowest, double highest) {
    String query = "SELECT * from coffee WHERE caffeine_level > %s AND caffeine_level < %s";
    return _dbClient.runQuery(String.format(query, lowest, highest));
  }

  public static interface Component extends CoffeeClient.Component, DBClientImpl.DefaultComponent {

    default CoffeeClient coffeeClient() {
      return new DefaultCoffeeClient(dbClient());
    }
  }
}
