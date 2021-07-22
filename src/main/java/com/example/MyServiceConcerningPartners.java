package com.example;

import javax.inject.Named;
import javax.inject.Singleton;

@Singleton
public class MyServiceConcerningPartners {

  private StuffClient stuffClient;

  public MyServiceConcerningPartners(@Named("partner") StuffClient stuffClient) {
    this.stuffClient = stuffClient;
  }

  public String getConfigAsString() {
    StuffConfig config = stuffClient.getStuffConfig();
    return "url:" + config.getStuffUrl() + ",user:" + config.getStuffUser();
  }
}
