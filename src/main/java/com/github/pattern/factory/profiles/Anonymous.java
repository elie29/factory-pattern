package com.github.pattern.factory.profiles;

import com.github.pattern.factory.model.Item;

import java.util.List;

public class Anonymous implements Profile {

   private final String name;
   private final int index;

   Anonymous(String name, int index) {
      this.name = name;
      this.index = index;
   }

   @Override
   public List<Item> generate() {
      return List.of(new Item());
   }
}
