package com.example;

import io.micronaut.configuration.picocli.PicocliRunner;
import io.micronaut.context.ApplicationContext;

import javax.inject.Inject;
import picocli.CommandLine.Command;
import picocli.CommandLine.Option;

@Command(name = "demo", description = "...",
    mixinStandardHelpOptions = true)
public class DemoCommand implements Runnable {

  @Inject
  private MyServiceConcerningPartners myServiceConcerningPartners;

  @Inject
  private MyServiceConcerningCustomers myServiceConcerningCustomers;

  @Option(names = {"-v", "--verbose"}, description = "...")
  boolean verbose;

  public static void main(String[] args) throws Exception {
    PicocliRunner.run(DemoCommand.class, args);
  }

  public void run() {
    // business logic here
    System.out.println("partners: " + myServiceConcerningPartners.getConfigAsString());
    System.out.println("customers: " + myServiceConcerningCustomers.getConfigAsString());
    if (verbose) {
      System.out.println("Hi!");
    }
  }
}
