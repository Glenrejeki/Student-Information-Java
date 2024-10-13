public abstract class Person {
  String name;
  int age;

  protected Person(String name ,int age){
      this.name = name;
      this.age = age;
  }

  protected String getName() {
      return name; // Implement getter
  }

  protected int getAge() {
      return age; // Implement getter
  }

  public abstract void work();
}
