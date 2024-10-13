public class Course {
  String name;
  int credits;

  protected Course(String name , int credits){
      this.name = name;
      this.credits = credits;
  }

  protected String getName(){
      return name;
  }

  protected int getCredits(){
      return credits;
  }
}
