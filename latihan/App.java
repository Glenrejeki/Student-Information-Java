public class App {
  public static void main(String[] args) {
  Customer customer = new Customer();
  customer.setName("Abdullah");
  customer.setLevel(Level.VIP);
  System.out.println(customer.getName());
  System.out.println(customer.getLevel());
  System.out.println(customer.getLevel().getDescription());
  // Konversi Enum ke String
  Level level = Level.valueOf("VIP");
  System.out.println(level);
  System.out.println(Level.STANDARD.name());
  System.out.println("Print Level:");
  for (var value : Level.values()) {
  System.out.println("- " + value);
  }
}
  