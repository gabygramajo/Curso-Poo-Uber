class Car {
  // Atributos de la clase Car
  Integer id;
  String license;
  Driver driver;
  int passenger;

  // Creando el método constructor e indicando los parámetros oblicatorios
  public Car(String license, Driver driver){
    this.license = license; 
    this.driver = driver;
    //This hace referencia al objeto actual de la clase, es decir, a una instancia concreta de la clase y nos sirve para usar los métodos y atributos de esa clase desde alguno de sus métodos, para llamar a otro de sus constructores o simplemente para pasarle el objeto completo a algún otro método u objeto.
  }
 
  //Metodo
  void printDataCar() {
    System.out.println("License: " + license + " Driver: " + driver.name);
  }
}
