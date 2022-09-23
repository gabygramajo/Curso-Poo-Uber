class Driver extends Account {
  public Driver(String name, String document) {
    super(name, document);
  }
  void printInfo() {
    System.out.println(
      "Nombre: " + name + 
      " Documento: " + document
    );
  }
}
