package bingo;

import java.util.LinkedList;

public class Carton {
    private int numeroCarton;
    private final LinkedList<Integer> numeros;
    public Carton(int numeroCarton) { //Constructor por Defecto
        this.numeroCarton = numeroCarton;
        this.numeros = new LinkedList<>();
    }

    public Carton(LinkedList<Integer> n) {
        this.numeros = new LinkedList<>(n);
    }

    //Funciones de Consulta
    public int getTamaño() { return this.numeros.size(); }
    public int getNumeroCarton() { return this.numeroCarton; }
    public LinkedList<Integer> getNumeros() { return new LinkedList<>(this.numeros); }
}
