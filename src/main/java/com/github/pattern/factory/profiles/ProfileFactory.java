package com.github.pattern.factory.profiles;

import static com.github.pattern.factory.profiles.Admin.ADMIN;
import static com.github.pattern.factory.profiles.Hr.HR;
import static com.github.pattern.factory.profiles.Hrd.HRD;
import static com.github.pattern.factory.profiles.Validator.VALIDATOR;

public class ProfileFactory {

   public static Profile create(String profile) {
      switch (profile) {
      case ADMIN:
         return new Admin();
      case HR:
         return new Hr();
      case HRD:
         return new Hrd();
      case VALIDATOR:
         return new Validator();
      default:
         return new Anonymous();
      }
   }

}
