public class Home {
  private String model;
  private Address address;
  private Person owner;

  protected Home(String model , Person owner ,String addressCity ,String addressStreet){
      this.model = model;
      this.address = new Address(addressCity,addressStreet);
      this.owner = owner;

  }

  protected String getModel(){
      return model;
  }

  protected Address getAddress(){
      return address;
  }

  protected Person getOwner(){
      return owner;
  }





}

