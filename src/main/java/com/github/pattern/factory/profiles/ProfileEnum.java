package com.github.pattern.factory.profiles;

public enum ProfileEnum {

   ADMIN(Admin::new),
   HR(Hr::new),
   HRD(Hrd::new),
   VALIDATOR(Validator::new);

   private final ProfileFunction profileFunction;

   ProfileEnum(ProfileFunction profileFunction) {
      this.profileFunction = profileFunction;
   }

   public Profile get(String name, int index) {
      return profileFunction.apply(name, index);
   }

}