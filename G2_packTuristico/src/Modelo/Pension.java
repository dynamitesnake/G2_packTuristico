
package modelo;

public class Pension {
    private int idPension;
    private String nombre;
    private double porcentaje;

    public Pension(int idPension, String nombre, double porcentaje) {
        this.idPension = idPension;
        this.nombre = nombre;
        this.porcentaje = porcentaje;
    }

    public int getIdPension() {
        return idPension;
    }

    public void setIdPension(int idPension) {
        this.idPension = idPension;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(double porcentaje) {
        this.porcentaje = porcentaje;
    }
    
}