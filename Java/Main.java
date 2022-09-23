class Main {
  public static void main(String[] args) {
    
    Driver driver = new Driver("Andres Herrera", "AND123544");
    driver.printInfo();
    // Instanciando un objeto de tipo Car
    Car car = new Car("AMQ123", driver); 
    //Car car = new Car("AMQ123", new Account("Andres Herrera", "AND123544")); 
    // Accediendo a los atributos con la sintaxis de punto
    car.passenger = 4;

    car.printDataCar(); // Accediendo al método

    //Instanciando un 2do objeto de tipo Car
    Driver driver2 = new Driver("Lucía Rojas", "LRJ234562");
    Car car2 = new Car("QWE567", driver2);
    //Car car2 = new Car("QWE567", new Account("Lucía Rojas", "LRJ234562")); 
    car2.passenger = 3;

    car2.printDataCar();

    User user = new User("Miguel López", "BDS567234");
    user.email = "miguelL@gmail.com";
    user.password = "234432";
    user.printInfo();
  }
}