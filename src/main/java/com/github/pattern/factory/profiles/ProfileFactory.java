package com.github.pattern.factory.profiles;

import java.util.HashMap;
import java.util.Map;

import static com.github.pattern.factory.profiles.Admin.ADMIN;
import static com.github.pattern.factory.profiles.Hr.HR;
import static com.github.pattern.factory.profiles.Hrd.HRD;
import static com.github.pattern.factory.profiles.Validator.VALIDATOR;

public class ProfileFactory {

   private final static Map<String, ProfileFunction> profiles = new HashMap<>();

   static {
      profiles.put(ADMIN, Admin::new);
      profiles.put(HR, Hr::new);
      profiles.put(HRD, Hrd::new);
      profiles.put(VALIDATOR, Validator::new);
   }

   public static Profile create(String profile, String name, int index) {
      if (profiles.containsKey(profile)) {
         return profiles.get(profile).apply(name, index);
      }
      return new Anonymous(name, index);
   }

}
