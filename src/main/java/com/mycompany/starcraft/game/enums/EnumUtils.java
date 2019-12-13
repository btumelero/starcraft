package com.mycompany.starcraft.game.enums;

import java.util.stream.Stream;

/**
 *
 * @author btume
 */
abstract class EnumUtils {
  
  /**
   * Returns a string array with the names of the given enumClass
   * @param <T>
   * @param enumClass The enum class to retrieve the names from
   * @return All declared enums in the given enum class as a string array
   */
  static <T extends Enum<T>> String[] getNames(Class<T> enumClass) {
    return Stream.of(enumClass.getEnumConstants()).map(Enum::name).toArray(String[]::new);
  }
  
}
