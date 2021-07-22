package com.example;

import io.micronaut.context.annotation.EachBean;
import io.micronaut.context.annotation.Factory;

@Factory
public class StuffClientFactory {

  @EachBean(StuffConfig.class)
  StuffClient stuffClient(StuffConfig config) {
    return new StuffClient(config);
  }
}
