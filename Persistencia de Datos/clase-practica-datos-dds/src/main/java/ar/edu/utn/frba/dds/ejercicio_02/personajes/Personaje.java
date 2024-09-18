package ar.edu.utn.frba.dds.ejercicio_02.personajes;

import ar.edu.utn.frba.dds.ejercicio_02.Persistente;
import ar.edu.utn.frba.dds.ejercicio_02.converters.ElementoDefensorAttributeConverter;
import ar.edu.utn.frba.dds.ejercicio_02.elementos.ElementoDefensor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@Table(name = "personaje")
@DiscriminatorColumn(name = "tipo")
public class Personaje extends Persistente {
  @ElementCollection
  @CollectionTable(name = "elemento_defensor")
  @Convert(converter = ElementoDefensorAttributeConverter.class)
  @Column(name = "elemento")
  private List<ElementoDefensor> elementos;

  @Column(name="estamina", columnDefinition="INTEGER")
  private Integer estamina;

  @Column(name="puntos_de_vida", columnDefinition="INTEGER")
  private Integer puntosDeVida;

  public Personaje(){
    this.elementos = new ArrayList<>();
  }

  public void atacar(Personaje personaje) {
    //todo
  }

  public void agregarElemento(ElementoDefensor elemento){
    this.elementos.add(elemento);
  }

}