from ast import main
from car import Car #Importando nuestra clase Car
from account import Account

if __name__ == "__main__":
  #En Python no se necesita el tipo de dato, la palabra reservada new, ni el ;
  car = Car("AMS234", Account("Andres Herrera", "ANDA876")) 
  print(vars(car))
  print(vars(car.driver))


  # car.license = "AMS234"
  # car.driver = "Andres Herrera"
  # car.passenger = 4

  # print(vars(car))

  # car2 = Car() 
  # car2.license = "QWE567"
  # car2.driver = "Lucía Rojas"
  # car2.passenger = 3

  # print(vars(car2))
