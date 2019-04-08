package bingo;

import bingo.utilidades.Utilidades;
import java.util.Collections;
import java.util.LinkedList;

public class Bingo {

    private LinkedList<Integer> bombo;
    private LinkedList<Integer> BolasExtraidas;
    private LinkedList<Carton> cartones;
    private LinkedList<Carton> CartonesGanadores;

    public Bingo() {
        this.BolasExtraidas = new LinkedList<>();
        this.cartones = new LinkedList<>();
        this.CartonesGanadores = new LinkedList<>();
        this.bombo = new LinkedList<>(Utilidades.getNumeros());
    }

    //Funcionalidades
    public boolean finalizado() {
        boolean res = false;
        if (this.bombo.isEmpty()) {
            res = true;
        }

        if (this.CartonesGanadores.size() > 1) {
            res = true;
        }

        return res;
    }

    public boolean comprobarCarton(Carton c) {
        return this.BolasExtraidas.containsAll(c.getNumeros());
    }

    public Carton generarCarton() {
        LinkedList<Integer> numeros = new LinkedList<>(this.bombo);
        LinkedList<Integer> numerosCarton = new LinkedList<>();
        Collections.shuffle(numeros);
        for (int i = 1; i <= Utilidades.TamañoCarton; i++) {
            numerosCarton.add(numeros.pop());
        }
        Carton c = new Carton(numerosCarton);
        this.cartones.add(c);
        return c;
    }

    public int extraerBola() {
        Collections.shuffle(this.bombo);
        this.BolasExtraidas.add(this.bombo.peekFirst()); //Peekfirst -> devuelve el primer elemento , no lo borra
        for (Carton c : this.cartones) {
            if (comprobarCarton(c)) {
                this.CartonesGanadores.add(c);
                break;
            }
        }

        return this.bombo.pop(); //devuelve el primer elemento y lo elimina
    }
}
