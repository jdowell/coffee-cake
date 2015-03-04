package com.jacksondowell.client.impl;

import com.jacksondowell.client.DBClient;
import com.jacksondowell.models.Coffee;
import java.util.Arrays;
import java.util.List;


public class DBClientImpl implements DBClient {

  @Override
  public List<Coffee> runQuery(String query) {
    // very sophisticated
    return Arrays.asList(new Coffee("Foo bar", 0.02), new Coffee("bar baz", 0.1), new Coffee("scary", 0.9));
  }

  public interface DefaultComponent extends DBClient.Component {

    @Override
    default DBClient dbClient() {
      // DBClientImpl has no dependencies, so we can just provide it via a Component
      return new DBClientImpl();
    }
  }
}
