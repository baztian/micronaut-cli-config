package com.example;

import javax.inject.Named;
import javax.inject.Singleton;

@Singleton
public class MyServiceConcerningCustomers {

  private StuffClient stuffClient;

  public MyServiceConcerningCustomers(@Named("customer") StuffClient stuffClient) {
    this.stuffClient = stuffClient;
  }

  public String getConfigAsString() {
    StuffConfig config = stuffClient.getStuffConfig();
    return "url:" + config.getStuffUrl() + ",user:" + config.getStuffUser();
  }
}
