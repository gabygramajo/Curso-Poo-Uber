class Car {

  // Creando el método constructor
  constructor(license, driver) {
    this.id;
    this.license = license;
    this.driver = driver;
    this.passenger;
  }

  // los métodos ya no necesitan la palabra reservada function
  printDataCar() {
    console.log(this.driver);
    console.log(`${this.driver.name} ${this.driver.document}`);
  }
}