package com.github.pattern.factory.profiles;

import com.github.pattern.factory.model.Item;

import java.util.List;

public class Admin implements Profile {

   public static final String ADMIN = "admin";

   @Override
    public List<Item> generate() {
        return List.of(new Item());
    }
}
