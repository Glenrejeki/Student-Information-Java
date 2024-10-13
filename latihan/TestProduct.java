package delcom.model;
  public class TestProduct {
  public static void main(String[] args) {
  Product product = new Product("Sari Gandum", 10_000);
  product.price = 12_000;
  System.out.println(product.price);
  }
}
