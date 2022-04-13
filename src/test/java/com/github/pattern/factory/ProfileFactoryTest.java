package com.github.pattern.factory;

import com.github.pattern.factory.profiles.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static com.github.pattern.factory.profiles.Admin.ADMIN;
import static com.github.pattern.factory.profiles.Hr.HR;
import static com.github.pattern.factory.profiles.Hrd.HRD;
import static com.github.pattern.factory.profiles.Validator.VALIDATOR;
import static org.assertj.core.api.Assertions.assertThat;

public class ProfileFactoryTest {

   @ParameterizedTest(name = "[{index}] {0} is instance of {1}")
   @MethodSource("provider")
   public void shouldReturnValidProfile(String profile, Class<Profile> expected) {
      assertThat(ProfileFactory.create(profile, "foo", 0)).isNotNull();
      assertThat(ProfileFactory.create(profile, "foo", 0)).isInstanceOf(expected);
   }

   private static Stream<Arguments> provider() {
      return Stream.of(
         Arguments.of(ADMIN, Admin.class),
         Arguments.of(HR, Hr.class),
         Arguments.of(HRD, Hrd.class),
         Arguments.of(VALIDATOR, Validator.class),
         Arguments.of("Foo", Anonymous.class)
      );
   }
}
