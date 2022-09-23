class Car:
  id = int
  license = str
  driver = str
  passenger = int

  #Constructor
  def __init__(self, license, driver):
    self.license = license
    self.driver = driver