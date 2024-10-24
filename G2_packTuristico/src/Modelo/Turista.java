
package Modelo;

public class Turista {
    
    private int dni;
    private String nombre;
    private int edad;
    private int idPaquete;
    
   public Turista (){
}
    public Turista(int dni, String nombre, int edad, int idPaquete) {
        this.dni = dni;
        this.nombre = nombre;
        this.edad = edad;
        this.idPaquete = idPaquete;
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
   
    @Override
    public String toString() {
        return "Turista{" + "DNI=" + dni + ", nombre=" + nombre + ", edad=" + edad + ", Id Paquete=" + idPaquete + '}';
    }
   
}
