package com.github.pattern.factory.profiles;

import com.github.pattern.factory.model.Item;

import java.util.List;

public class Anonymous implements Profile {

   private final String name;

   Anonymous(String name) {
      this.name = name;
   }

   @Override
   public List<Item> generate() {
      return List.of(new Item());
   }
}
