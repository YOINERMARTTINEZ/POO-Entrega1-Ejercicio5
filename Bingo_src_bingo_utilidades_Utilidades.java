/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bingo.utilidades;

import java.util.ArrayList;

public class Utilidades {
    public final static int BOLA_MAYOR = 30;
    public final static int TAMAÑO_CARTON = 9;
    public static ArrayList<Integer> getNumeros() {
        ArrayList<Integer> num = new ArrayList<>();
        for(int i = 1; i <= BOLA_MAYOR; i++) {
            num.add(i);
        }
        return num;
    }
}
