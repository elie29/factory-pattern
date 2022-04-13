package com.github.pattern.factory.profiles;

import com.github.pattern.factory.model.Item;

import java.util.List;

public class Validator implements Profile {

   public static final String VALIDATOR = "validator";

   private final String name;

   Validator(String name) {
      this.name = name;
   }
    
   @Override
   public List<Item> generate() {
      return List.of(new Item());
   }
}
