package com.mycompany.starcraft.game.enums;

import java.util.stream.Stream;

/**
 *
 * @author btume
 */
abstract class EnumUtils {
  
  static <T extends Enum<T>> String[] getStringValues(Class<T> enumClass) {
    return Stream.of(enumClass.getEnumConstants()).map(Enum::name).toArray(String[]::new);
  }
  
}
