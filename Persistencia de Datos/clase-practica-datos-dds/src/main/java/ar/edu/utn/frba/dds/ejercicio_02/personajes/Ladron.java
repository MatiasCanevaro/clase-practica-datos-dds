package ar.edu.utn.frba.dds.ejercicio_02.personajes;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;

@Getter
@Setter

@Entity
@DiscriminatorColumn(name = "ladron")
public class Ladron extends Personaje{
  @Column(name="nivel_siniestro", columnDefinition="INTEGER")
  private Integer nivelSiniestro;
  @Column(name="tiene_navaja", columnDefinition="TINYINT<33333333333333333")
  private Boolean tieneNavaja;

  public void atacar(Personaje personaje) {
    //TODO
  }
}
