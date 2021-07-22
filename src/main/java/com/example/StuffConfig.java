package com.example;

import io.micronaut.context.annotation.ConfigurationProperties;
import io.micronaut.context.annotation.Context;
import io.micronaut.context.annotation.EachProperty;
import io.micronaut.context.annotation.Parameter;
import javax.validation.constraints.NotBlank;

@EachProperty("config.stuff")
public class StuffConfig {

  private final String name;
  private String stuffUser;
  private String stuffUrl;

  public StuffConfig(@Parameter String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }


  public String getStuffUser() {
    return stuffUser;
  }

  public void setStuffUser(String stuffUser) {
    this.stuffUser = stuffUser;
  }

  public String getStuffUrl() {
    return stuffUrl;
  }

  public void setStuffUrl(String stuffUrl) {
    this.stuffUrl = stuffUrl;
  }
}
