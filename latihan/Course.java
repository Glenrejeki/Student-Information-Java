public class Course {
  private String code;
  private String name;
  public Course(String code, String name) {
  this.code = code;
  this.name = name;
  }
  public String getCode() {
  return this.code;
  }
  public void setCode(String code) {
  this.code = code;
  }
  public String getName() {
  return this.name;
  }
  public void setName(String name) {
  this.name = name;
  }
  // Method asosiasi untuk mengaitkan Student dengan kelas Course
  public void chosenByStudent(Student student) {
  System.out.println(name + " mengambil mata kuliah " +
  student.getName());
  }
}