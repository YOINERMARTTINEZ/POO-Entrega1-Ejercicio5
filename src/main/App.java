
package main;

import bingo.Bingo;
import bingo.Carton;
import java.util.ArrayList;

public class App {

    public static void main(String[] args) {
        Bingo bingo = new Bingo();
        Carton ct1 = new Carton(1), ct2 = new Carton(2), ct3 = new Carton(3);
        ArrayList<Carton> cartones = new ArrayList<>(3);
        cartones.add(ct1);
        cartones.add(ct2);
        cartones.add(ct3);
        for (Carton car : cartones) {
            System.out.println("Numeros del Carton: " + car.getNumeroCarton());
            car = bingo.generarCarton();
            System.out.println(car.getNumeros().toString());
        }

        do {
            int balota = bingo.extraerBola();
            System.out.println("Balota Extraida: " + balota);
        } while (!bingo.finalizado());

        System.out.println("\nFin del Bingo!");
        for (Carton car : cartones) {
            if (bingo.comprobarCarton(car)) {
                System.out.println("Carton " + car.getNumeroCarton() + " Ganador!");
            }
        }
    }

}
