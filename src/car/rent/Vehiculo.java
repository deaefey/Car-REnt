
package car.rent;

public class Vehiculo {
    
      // Atributos del vehiculo
    
    private String patente;
    private char condicion;
    
    // Constructor para inicializar el objeto Vehiculo
    
    public Vehiculo(String patente, char condicion) {
        this.patente = patente;
        this.condicion = condicion;
    }
    
    // Getters y Setters

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public char getCondicion() {
        return condicion;
    }

    public void setCondicion(char condicion) {
        this.condicion = condicion;
    }
    
    // Método toString para devolver una representación del objeto como String
    @Override
    public String toString() {
        return "Vehiculo{" +
                "patente='" + patente + '\'' +
                ", condicion=" + condicion +
                '}';
    }
}
