import java.util.ArrayList;
import java.util.Map;

class UberVan extends Car {
  // Tipo de auto aceptados en Uber con marca(str) y modelo(str) y año(int)
  Map<String, Map<String, Integer>> typeCarAccepted;
  // Tipo de Material aceptado
  ArrayList<String> seatsMaterial;
  // constructor
  public UberVan(String license, Account driver, 
  Map<String, Map<String, Integer>> typeCarAccepted,
  ArrayList<String> seatsMaterial){
  
    super(license, driver);
    this.typeCarAccepted = typeCarAccepted;
    this.seatsMaterial = seatsMaterial;
  }
}