class User extends Account {
  
  public User(String name, String document) {
    super(name, document);
  }
  
  void printInfo() {
    System.out.println(
      "Nombre: " + name + 
      " Documento: " + document
    );
  }
}
