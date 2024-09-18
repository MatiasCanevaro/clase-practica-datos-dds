package ar.edu.utn.frba.dds.ejercicio_02;

import ar.edu.utn.frba.dds.ejercicio_02.personajes.Personaje;
import lombok.Getter;
import lombok.Setter;
import ar.edu.utn.frba.dds.ejercicio_02.Persistente;
import javax.persistence.*;
import java.time.LocalDate;

@Getter
@Setter

@Entity
@Table(name ="jugador")
public class Jugador extends Persistente {
  @Column(name = "nombre")
  private String nombre;
  @Column(name = "apellido")
  private String apellido;
  @Column(name = "fecha_alta", columnDefinition = "DATE")
  private LocalDate fechaAlta;
  @ManyToOne
  @JoinColumn(name="personaje_id", referencedColumnName = "id")
  private Personaje personaje;

  public Jugador() {
    this.fechaAlta = LocalDate.now();
  }

  public void cambiarPersonaje(Personaje personaje) {
    this.personaje = personaje;
  }
}