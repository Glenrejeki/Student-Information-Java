public class Mobil {
  private String merk;
  private String model;
  private Mesin mesin;
  public Mobil(String merk, String model, String jenisMesin) {
    this.merk = merk;
    this.model = model;
    this.mesin = new Mesin(jenisMesin);
  }
  public String getMerk() {
    return merk;
  }
  public String getModel() {
    return model;
  }
  public Mesin getMesin() {
    return mesin;
  }
}