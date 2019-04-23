package com.company;


import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.println("Numeros primos hasta el 100: " + numerosPrimosHastaEl100());

        //resultado de la pregunta 3 del examen, con el número 99 como ejemplo
        System.out.println(verificarSiElNumeroNaturalEsPrimo(99));
    }

    public static boolean verificarSiElNumeroNaturalEsPrimo(int numeroAVerificar) {

        //si el número es menor a 0, no es natural. A su vez, 0 y 1 se sabe que no son primos
        if (numeroAVerificar <= 1){
            return false;
        }

        //si el numero es divisible por algo desde el 2 inclusive hasta sí mismo, tampóco es primo
        for (int i = 2; i < numeroAVerificar; i++){
           if (numeroAVerificar % i == 0) {
               return false;
           }
        }
        //de lo contrario, si lo es.
        return true;
    }

    // este método lo hago para corroborar que el anterior método funciona correctamente.
    public static List numerosPrimosHastaEl100() {
        List<Integer> numerosPrimos = new ArrayList();

        for (int i = 0; i < 100; i++){
            if (verificarSiElNumeroNaturalEsPrimo(i) == true) {
                numerosPrimos.add(i);
            }
        }

        return numerosPrimos;
    }
}
