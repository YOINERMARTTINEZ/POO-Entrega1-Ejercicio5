
package bingo.utilidades;

import java.util.ArrayList;

public class Utilidades {
    public final static int BolaMayor = 30;
    public final static int TamañoCarton = 9;
    public static ArrayList<Integer> getNumeros() {
        ArrayList<Integer> num = new ArrayList<>();
        for(int i = 1; i <= BolaMayor; i++) {
            num.add(i);
        }
        return num;
    }
}
