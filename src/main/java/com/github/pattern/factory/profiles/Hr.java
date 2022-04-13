package com.github.pattern.factory.profiles;

import com.github.pattern.factory.model.Item;

import java.util.List;

public class Hr implements Profile {

   public static final String HR = "hr";
   
   private final String name;

   Hr(String name) {
      this.name = name;
   }

   @Override
   public List<Item> generate() {
      return List.of(new Item());
   }
}
