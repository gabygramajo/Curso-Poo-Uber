class UberPool extends Car { 
  String brand;
  String model;

  // constructor
  public UberPool(String license, Driver driver, String brand, String model){

    super(license, driver);
    this.brand = brand;
    this.model = model;
  }
}
