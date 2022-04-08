package com.github.pattern.factory.profiles;

import com.github.pattern.factory.model.Item;

import java.util.List;

public class Hrd implements Profile {

   public static final String HRD = "hrd";

   @Override
   public List<Item> generate() {
      return List.of(new Item());
   }
}
