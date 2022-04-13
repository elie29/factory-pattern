package com.github.pattern.factory.profiles;

@FunctionalInterface
public interface ProfileFunction {

   Profile apply(String name, int index);
}
