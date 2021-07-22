package com.example;

import io.micronaut.context.annotation.EachProperty;
import javax.validation.constraints.NotBlank;

@EachProperty("config.stuff")
public interface StuffConfig {

  @NotBlank
  String getStuffUser();

  @NotBlank
  String getStuffUrl();
}
