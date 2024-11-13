
package Modelo;

/**
 *
 * @author deborahhhh
 */
public class Habitacion {
    private int IdHabitacion;
    private int Planta;
    private int Numeracion;
    private int Cupo;
    private int idalojamiento;
    private boolean Estado;

    public Habitacion() {
    }

    public Habitacion(int Planta, int Numeracion, int Cupo, int idalojamiento, boolean Estado) {
        this.Planta = Planta;
        this.Numeracion = Numeracion;
        this.Cupo = Cupo;
        this.idalojamiento = idalojamiento;
        this.Estado = Estado;
    }

    public Habitacion(int IdHabitacion, int Planta, int Numeracion, int Cupo, int idalojamiento, boolean Estado) {
        this.IdHabitacion = IdHabitacion;
        this.Planta = Planta;
        this.Numeracion = Numeracion;
        this.Cupo = Cupo;
        this.idalojamiento = idalojamiento;
        this.Estado = Estado;
    }

    public int getIdalojamiento() {
        return idalojamiento;
    }

    public void setIdalojamiento(int idalojamiento) {
        this.idalojamiento = idalojamiento;
    }
    
    public int getIdHabitacion() {
        return IdHabitacion;
    }

    public void setIdHabitacion(int IdHabitacion) {
        this.IdHabitacion = IdHabitacion;
    }

    public int getPlanta() {
        return Planta;
    }

    public void setPlanta(int Planta) {
        this.Planta = Planta;
    }

    public int getNumeracion() {
        return Numeracion;
    }

    public void setNumeracion(int Numeracion) {
        this.Numeracion = Numeracion;
    }

    public int getCupo() {
        return Cupo;
    }

    public void setCupo(int Cupo) {
        this.Cupo = Cupo;
    }

  
  public boolean isActivo(){
  return Estado;
  }
  public void setActivo (boolean Estado){
  this.Estado = Estado;
  }

    @Override
  public String toString(){
      
        return "Habitacion" + "IdHabitacion=" + IdHabitacion + ", Planta" + Planta + ", Numeracion" + Numeracion + ", Cupo=" + Cupo + ", idalojamiento="+ idalojamiento +", Estado=" + Estado + "}" ;
      
  }
}
