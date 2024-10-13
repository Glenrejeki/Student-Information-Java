public class Printer {
  private InkCartridge ink;
  public Printer(InkCartridge ink) {
  this.ink = ink;
  }
  public void print(String text) {
  System.out.println("Printing: " + text);
  System.out.println("Using ink color: " + ink.getColor());
  }
}