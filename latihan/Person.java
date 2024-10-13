public class Person {
  public String name;
  protected String gender;
  int age; // access modifier: default atau package
  private String address;
public Person() {
}
public Person(String name, String gender, int age, String address) {
this.name = name;
this.gender = gender;
this.age = age;
this.address = address;
}
public void setAddress(String address) {
this.address = address;
}
public String getAddress() {
return this.address;
}
}
