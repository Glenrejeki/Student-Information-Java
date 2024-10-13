public class Shape {
  int getCorner() {
  return 0;
  }
  }
  class Rectangle extends Shape {
  int getCorner() {
  return 4;
  }
  int getParentCornet() {
  return super.getCorner();
  }
  }