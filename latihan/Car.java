public interface Car extends HasBrand, IsMaintenance {
  void drive();
  int getTier();
  default boolean isBig() {
    return false;
    }
    default boolean isMaintenance() {
    return false;
    }
  }    