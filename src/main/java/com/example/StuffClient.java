package com.example;

import javax.inject.Inject;

public class StuffClient {

  private StuffConfig stuffConfig;

  @Inject
  public StuffClient(StuffConfig stuffConfig) {
    this.stuffConfig = stuffConfig;
  }

  public StuffConfig getStuffConfig() {
    return stuffConfig;
  }
}
