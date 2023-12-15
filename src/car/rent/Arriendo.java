
package car.rent;


public class Arriendo {
    
     // Atributos del Arriendo
    
    private int numArriendo;
    private String fecArr; // Fecha de arriendo
    private int diasArriendo;
    private int precioDia; // Precio por día agregado
    
      // Constructor para inicializar el objeto Arriendo

    public Arriendo(int numArriendo, String fecArr, int diasArriendo, int precioDia) {
        this.numArriendo = numArriendo;
        this.fecArr = fecArr;
        this.diasArriendo = diasArriendo;
        this.precioDia = precioDia;
    }

    public int obtenerMontoAPagar() {
        return diasArriendo * precioDia;
    }

    public boolean evaluarArriendo() {
        // Evaluar arriendo
        return true;
    }

    // Getters
    public int getNumArriendo() {
        return numArriendo;
    }

    public String getFecArr() {
        return fecArr;
    }

    public int getDiasArriendo() {
        return diasArriendo;
    }

    public int getPrecioDia() {
        return precioDia;
    }

    // Setters
    public void setNumArriendo(int numArriendo) {
        this.numArriendo = numArriendo;
    }

    public void setFecArr(String fecArr) {
        this.fecArr = fecArr;
    }

    public void setDiasArriendo(int diasArriendo) {
        this.diasArriendo = diasArriendo;
    }

    public void setPrecioDia(int precioDia) {
        this.precioDia = precioDia;
    }

    @Override
    public String toString() {
        return "Arriendo{" +
                "numArriendo=" + numArriendo +
                ", fecArr='" + fecArr + '\'' +
                ", diasArriendo=" + diasArriendo +
                ", precioDia=" + precioDia +
                '}';
    }
}
