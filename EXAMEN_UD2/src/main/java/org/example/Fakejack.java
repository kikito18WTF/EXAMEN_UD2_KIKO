package org.example;

import java.util.Random;
import java.util.Scanner;

public class Fakejack {

    static void main() {

        Random aleatorio = new Random();
        Scanner entrada = new Scanner(System.in);


        int min = 17;
        int max = 21;

        int puntos_banca = aleatorio.nextInt(max - min + 1) + min;

        int puntuacion = 0;

        String opcion = " ";

        System.out.println(puntos_banca);

        System.out.println("*** BiENVENIDO AL FACKEJACK");
        int carta_jugador = aleatorio.nextInt(10) + 2;

        System.out.println("Tu carta es: " + carta_jugador);

        puntuacion = carta_jugador;
        System.out.println("Puntuacion actual: " + puntuacion);

        System.out.println("----------------");

        do {

            System.out.println("¿Quieres otra? (S/N): ");
            opcion = entrada.next();
            opcion = opcion.toUpperCase();

            if (opcion.equals("S")) {

                carta_jugador = aleatorio.nextInt(10) + 2;
                System.out.println("Tu carta es: " + carta_jugador);
                puntuacion += carta_jugador;
                System.out.println("Puntuacion actual: " + puntuacion);

            }


            if (opcion.equals("N")) {

                if (puntuacion > puntos_banca) {
                    System.out.println("¡HAS GANADO¡");
                }else if (puntuacion < puntos_banca){
                    System.out.println("HAS PERDIDO");

                }else {
                    System.out.println("EMPATE");
                }



                System.out.println("Puntos banca: " + puntos_banca);
                System.out.println("Puntos jugador: " + puntuacion);

                return;
            }



        }while (puntuacion <= 21);




        System.out.println("------------------------");
        System.out.println("TE HAS PASADO LA BANCA GANA");



    }

}
