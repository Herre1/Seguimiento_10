public class Country  implements Comparable<Country>{

  private String nombre;
  private int medallas;
  private String tipoMedalla;


public String getTipoMedalla() {
    return tipoMedalla;
}
public void setTipoMedalla(String tipoMedalla) {
    this.tipoMedalla = tipoMedalla;
}
public String getNombre() {
    return nombre;
  }
  public void setNombre(String nombre) {
    this.nombre = nombre;
  }
  public int getmedallas() {
    return medallas;
  }
  public void setmedallas(int medallas) {
    this.medallas = medallas;
  }
  public Country(String nombre,String tipoMedalla, int medallas) {
    super();
    this.nombre = nombre;
    this.tipoMedalla = tipoMedalla;
    this.medallas = medallas;
    
  }
  @Override
  public int compareTo(Country o) {
    
    if (this.getmedallas()>o.getmedallas()) {
      return 1;
    }else if (this.getmedallas()<o.getmedallas()) {
      return -1;
    }else {
      return 0;
    }
  }
  public  String compareName(Country o){

    int comparedResult = this.getNombre().compareTo(o.getNombre());
     String mensaje;
    if (comparedResult > 0) {
        mensaje =  this.getNombre() + " comes after " + o.getNombre();
    } else if (comparedResult < 0) {
        mensaje = this.getNombre() + " comes before " +o.getNombre();
    } else {
       mensaje = this.getNombre()+ " is equal to " + o.getNombre();
    }
    
    return mensaje;
  }
  @Override 
  public String toString()
  {
      return "Pais "+ nombre + ", Medallas=" + medallas;
  }
  
}