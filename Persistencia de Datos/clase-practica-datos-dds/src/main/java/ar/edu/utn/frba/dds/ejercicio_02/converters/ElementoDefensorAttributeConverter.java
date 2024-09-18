package ar.edu.utn.frba.dds.ejercicio_02.converters;
import ar.edu.utn.frba.dds.ejercicio_02.elementos.Arco;
import ar.edu.utn.frba.dds.ejercicio_02.elementos.ElementoDefensor;
import ar.edu.utn.frba.dds.ejercicio_02.elementos.Escudo;

import javax.persistence.*;


@Converter(autoApply = true)
public class ElementoDefensorAttributeConverter implements AttributeConverter<ElementoDefensor, String> {

    public String convertToDatabaseColumn(ElementoDefensor elementoDefensor) {
        return elementoDefensor.getClass().getSimpleName();
    }

    public ElementoDefensor convertToEntityAttribute(String dbData) {
        switch (dbData) {
            case "Arco":
                return new Arco();
            case "Escudo":
                return new Escudo();
            default:
                throw new IllegalArgumentException("Unknown" + dbData);
        }
    }}