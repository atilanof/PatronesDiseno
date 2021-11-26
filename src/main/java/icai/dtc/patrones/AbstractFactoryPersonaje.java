package icai.dtc.patrones;

import icai.dtc.dominio.Personaje;

public abstract class AbstractFactoryPersonaje {
    public abstract Personaje getPersonaje(String personaje);

}
