package com.upsidle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * The class has the main method to get the application started.
 *
 * @author Eric Opoku
 * @version 1.0
 * @since 1.0
 */
@EnableScheduling
@SpringBootApplication
public class ApiApplication {

  /**
   * The application's entry point.
   *
   * @param args an array of command-line arguments for the application
   */
  public static void main(String[] args) {
    SpringApplication.run(ApiApplication.class, args);
  }
}
