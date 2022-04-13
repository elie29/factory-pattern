package com.github.pattern.factory.profiles;

public class ProfileFactory {

   public static Profile create(String profile, String name, int index) {
      try {
         ProfileEnum constant = ProfileEnum.valueOf(profile.toUpperCase());
         return constant.get(name, index);
      } catch (IllegalArgumentException iae) {
         return new Anonymous(name, index);
      }
   }

}
