package icai.dtc.patrones;

import icai.dtc.dominio.Humano;
import icai.dtc.dominio.Orco;
import icai.dtc.dominio.Personaje;

public class PersonajeFactory extends AbstractFactory{
    @Override
    public Personaje getPersonaje(String personaje) {
        Personaje p=null;
        if (personaje.equalsIgnoreCase("Humano")) {
            p=new Humano();
        }else if(personaje.equalsIgnoreCase("Orco")) {
            p=new Orco();
        }else {
            System.out.println("\nNo se puede crecer el personaje");
        }

        return p;
    }
}
