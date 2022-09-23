class UberX extends Car {
  String brand;
  String model;

  // constructor
  public UberX(String license, Account driver, String brand, String model){
    // *1
    super(license, driver);
    this.brand = brand;
    this.model = model;
  }
}
// *1 El método Súper  se utiliza para hacer referencia al método constructor de la super clase. O sea, de clase que hereda. Es como si llamara al constructor de la clase Car y heredará los atributos y métodos de su padre.