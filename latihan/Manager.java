public class Manager extends Employee {
  String name;
  String company;
  Manager(String name) {
  this(name, null);
  }
  Manager(String name, String company) {
  super(name);
  this.name = name;
  this.company = company;
  }
  void sayHello(String name) {
  System.out.println("Hi " + name + ", My Name is " + this.name + "
  (Manager)");
  }
  }