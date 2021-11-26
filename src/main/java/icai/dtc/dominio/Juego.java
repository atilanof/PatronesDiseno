package icai.dtc.dominio;

import icai.dtc.patrones.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Juego {


    public static void main(String[] args) {
        Personaje p;
        String personaje;
        PersonajeFactory factoria=new PersonajeFactory();
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader (isr);
        final boolean MODO_JUEGO=false;
        JuegoRed juegoRed;
        int opc;
        Dificultad d=null;
        int dificultad;


        try {
            //Elijo el personaje
            System.out.println("Elije con que personaje quieres jugar: ");
            personaje=br.readLine();
            p=factoria.getPersonaje(personaje);
            if (p!=null) {
                System.out.println("\nHas elegido jugar con: " + p.diRaza());
            }else {
                System.out.println("\nRaza no encontrada");
            }
            //Elijo el modo de juego
            System.out.println("\nElije el modo de juego: ");
            System.out.println("\n\t1.- Remoto ");
            System.out.println("\n\t2.- Local");
            opc=Integer.parseInt(br.readLine());
            if (opc==1) {
                if (MODO_JUEGO) {
                    juegoRed=new JuegoRedReal();
                }else {
                    juegoRed=new JuegoRedProxy();
                }
                System.out.println("\nCompruebando la conexión: "+juegoRed.turnoRemoto());
            }else {
                //Elijo la dificultad
                System.out.println("\nElije la dificultad del juego: ");
                System.out.println("\n\t1.- FACIL ");
                System.out.println("\n\t2.- MEDIO");
                System.out.println("\n\t3.- DIFICIL");

                dificultad =Integer.parseInt(br.readLine());
                //Generamos la clase según la dificultad
                if (dificultad==1) {
                    d=new Facil();
                }else if (dificultad==2) {
                    d=new Medio();
                }else if (dificultad==3) {
                    d=new Dificil();
                }else {
                    System.out.println("\nDificultad no valida");
                }
                if (d!=null)System.out.println("\nRealizamos el primer movimiento: "+d.movimiento());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
