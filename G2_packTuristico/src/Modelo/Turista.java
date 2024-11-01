
package Modelo;

public class Turista {
    
    private int dni;
    private String nombre;
    private int edad;
    private int idPaquete;
    private boolean activo;
    
    
    public Turista() {}
    
    public Turista (int dni){
            this.dni = dni;
    }
    
    public Turista(int dni, String nombre, int edad, int idPaquete, boolean activo) {
        this.dni = dni;
        this.nombre = nombre;
        this.edad = edad;
        this.idPaquete = idPaquete;
        this.activo = true;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getIdPaquete() {
        return idPaquete;
    }

    public void setIdPaquete(int idPaquete) {
        this.idPaquete = idPaquete;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }
    
    
    
    @Override
    public String toString() {
        return "Turista{" + "DNI=" + dni + ", nombre=" + nombre + ", edad=" + edad + ", Id Paquete=" + idPaquete + ", activo=" + activo + '}';
    }

   
}