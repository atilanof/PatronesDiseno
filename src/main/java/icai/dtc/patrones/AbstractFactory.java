package icai.dtc.patrones;

import icai.dtc.dominio.Personaje;

public abstract class AbstractFactory {
    public abstract Personaje getPersonaje(String personaje);

}
