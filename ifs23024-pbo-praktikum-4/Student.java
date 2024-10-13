public class Student extends Person implements Workable {
    private String nim;
    private Course enrollCourse;
  
    // Constructor untuk Student
    protected Student(String nim, String name, int age) {
        super(name, age); // Memanggil constructor dari superclass
        this.nim = nim;
    }
  
    // Getter untuk nim
    protected String getNim(){
        return nim;
    }
  
    // Getter untuk course yang di-enroll
    protected Course getEnrolledCourse(){
        return enrollCourse;
    }
  
    // Method untuk enroll course
    protected void enrollCourse(Course course){
        this.enrollCourse = course; // Set course yang di-enroll
    }
  
    // Override method work dari class Person
    @Override
    public void work(){
        System.out.println("Student is studying");
    }
  }
  
  
  