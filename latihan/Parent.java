public class Parent {
  String name;
  void info() {
  System.out.println("Ini adalah class Parent");
  }
  }
  class Child extends Parent {
  String name;
  void info() {
  System.out.println("Ini adalah class Child");
  System.out.println("Nama parent class adalah " + super.name);
  }
}