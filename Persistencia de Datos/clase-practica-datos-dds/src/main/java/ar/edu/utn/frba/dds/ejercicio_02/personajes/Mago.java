package ar.edu.utn.frba.dds.ejercicio_02.personajes;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;

@Getter
@Setter

@Entity
@DiscriminatorColumn(name = "mago")
public class Mago extends Personaje{
  @Column(name = "nivel_de_magia", columnDefinition="INTEGER")
  private Integer nivelDeMagia;
  @Column(name = "tiene_alas", columnDefinition = "TINYINT")
  private Boolean tieneAlas;

  public void atacar(Personaje personaje) {
    //TODO
  }

}