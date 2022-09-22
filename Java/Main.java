class Main {
  public static void main(String[] args) {
    
    // Instanciando un objeto de tipo Car
    Car car = new Car("AMQ123", new Account("Andres Herrera", "AND123544")); 
    // Accediendo a los atributos con la sintaxis de punto
    car.passenger = 4;

    car.printDataCar(); // Accediendo al método

    //Instanciando un 2do objeto de tipo Car
    Car car2 = new Car("QWE567", new Account("Lucía Rojas", "LRJ234562")); 
    car2.passenger = 3;

    car2.printDataCar();
    
  }
}