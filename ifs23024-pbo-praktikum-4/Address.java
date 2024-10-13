public class Address {
  private String city;
  private String street;

  protected  Address(String city , String street){
      this.city = city;
      this.street = street;
  }

  protected String getCity(){
      return city;
  }

  protected String getStreet(){
      return street;
  }
}
