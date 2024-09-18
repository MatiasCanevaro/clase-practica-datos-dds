package ar.edu.utn.frba.dds.ejercicio_02;

import ar.edu.utn.frba.dds.Repositorio;
import io.github.flbulgarelli.jpa.extras.simple.WithSimplePersistenceUnit;

public class MainExample implements WithSimplePersistenceUnit {
    private Repositorio repositorio;
    public static void main(String[] args) {
        MainExample instance = new MainExample();
        instance.impactar();
    }
    private void impactar(){
        withTransaction(() -> {
        });
    }
}
