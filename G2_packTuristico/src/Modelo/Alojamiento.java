
package Modelo;

public class Alojamiento {
    private int idAlojamiento;
    private String nombre;
    private int capacidad;
    private int nroAmbientes;
    private int camas;
    private int baños;
    private double precioNoche;

    public Alojamiento() {
    }

    public Alojamiento(int idAlojamiento, String nombre, int capacidad, int nroAmbientes, int camas, int baños, double precioNoche) {
        this.idAlojamiento = idAlojamiento;
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.nroAmbientes = nroAmbientes;
        this.camas = camas;
        this.baños = baños;
        this.precioNoche = precioNoche;
    }

    public int getIdAlojamiento() {
        return idAlojamiento;
    }

    public void setIdAlojamiento(int idAlojamiento) {
        this.idAlojamiento = idAlojamiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public int getNroAmbientes() {
        return nroAmbientes;
    }

    public void setNroAmbientes(int nroAmbientes) {
        this.nroAmbientes = nroAmbientes;
    }

    public int getCamas() {
        return camas;
    }

    public void setCamas(int camas) {
        this.camas = camas;
    }

    public int getBaños() {
        return baños;
    }

    public void setBaños(int baños) {
        this.baños = baños;
    }

    public double getPrecioNoche() {
        return precioNoche;
    }

    public void setPrecioNoche(double precioNoche) {
        this.precioNoche = precioNoche;
    }

    @Override
    public String toString() {
        return "Alojamiento " + nombre ;
    }
   
    
}
