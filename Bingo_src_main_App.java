/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import bingo.Bingo;
import bingo.Carton;
import java.util.ArrayList;

public class App {

    public static void main(String[] args) {
        Bingo bingo = new Bingo();
        Carton c1 = new Carton(1), c2 = new Carton(2), c3 = new Carton(3);
        ArrayList<Carton> cartones = new ArrayList<>(3);
        cartones.add(c1);
        cartones.add(c2);
        cartones.add(c3);
        for (Carton c : cartones) {
            System.out.println("Numeros del Carton: " + c.getNumeroCarton());
            c = bingo.generarCarton();
            System.out.println(c.getNumeros().toString());
        }

        do {
            int bola = bingo.extraerBola();
            System.out.println("Bola Extraida: " + bola);
        } while (!bingo.finalizado());

        System.out.println("\nFin del Bingo!");
        for (Carton c : cartones) {
            if (bingo.comprobarCarton(c)) {
                System.out.println("Carton " + c.getNumeroCarton() + " Ganador!");
            }
        }
    }

}
