package icai.dtc.patrones;

public class JuegoRedProxy implements JuegoRed{
    @Override
    public boolean turnoRemoto() {
        //Aquí estará toda la lógica real de comunicación.
        return true;
    }
}
