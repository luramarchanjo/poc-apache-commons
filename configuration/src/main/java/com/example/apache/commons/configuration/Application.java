package com.example.apache.commons.configuration;

import java.util.UUID;
import org.apache.commons.configuration2.EnvironmentConfiguration;

public class Application {

  public static void main(String[] args) {
    EnvironmentConfiguration environmentConfiguration = new EnvironmentConfiguration();
    String randomEnv = UUID.randomUUID().toString();

    boolean defaultValue = environmentConfiguration.getBoolean(randomEnv, Boolean.TRUE);
    System.out.println("Default value " + defaultValue);

    boolean value = environmentConfiguration.getBoolean("BOOLEAN_VALUE");
    System.out.println("Value " + value);

    Boolean defaultCastedValue = environmentConfiguration.get(Boolean.class, randomEnv, Boolean.FALSE);
    System.out.println("Default Casted Value " + defaultCastedValue);

    Boolean castedValue = environmentConfiguration.get(Boolean.class, "BOOLEAN_VALUE");
    System.out.println("Casted Value " + castedValue);
  }

}