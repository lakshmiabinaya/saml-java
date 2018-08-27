package com.imaginea.saml;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author lakshmiabinaya
 */

@SpringBootApplication(scanBasePackages = "com.imaginea.saml")
public class SAMLApplication {

  public static void main(String[] args) {
    SpringApplication.run(SAMLApplication.class, args);
  }

}
