package com.github.pattern.factory.profiles;

import com.github.pattern.factory.model.Item;

import java.util.List;

public class Validator implements Profile {

   public static final String VALIDATOR = "validator";

   private final String name;
   private final int index;

   Validator(String name, int index) {
      this.name = name;
      this.index = index;
   }

   @Override
   public List<Item> generate() {
      return List.of(new Item());
   }
}
