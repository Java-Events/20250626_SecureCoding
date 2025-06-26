package com.svenruppert.securecoding.passwords;

import java.security.SecureRandom;
import java.util.Base64;
import java.util.Random;


public class SaltGeneratorV1 {

  public static final int DEFAULT_SALT_LENGTH = 16;
  private static final Random SECURE_RANDOM = new SecureRandom();

  public String generateSalt(int length) {
    byte[] salt = new byte[length];
    SECURE_RANDOM.nextBytes(salt);
    return Base64.getEncoder().encodeToString(salt);
  }

  public String generateSalt(boolean secure) {
    return generateSalt(DEFAULT_SALT_LENGTH);
  }
}