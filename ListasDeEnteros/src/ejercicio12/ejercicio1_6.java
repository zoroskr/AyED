/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio12;

import tp02.ejercicio1.ListaDeEnterosEnlazada;

/**
 *
 * @author elmun
 */
public class ejercicio1_6 {
private ListaDeEnterosEnlazada lista = new ListaDeEnterosEnlazada();

public ListaDeEnterosEnlazada calcularSucesion (int n) {
    lista.agregarFinal(n);
    if (n == 1){
    }
    else{
        if ((n % 2) == 0) {
             calcularSucesion(n/2);
        }
        else {
             calcularSucesion(3*n+1);
        }
    }
    return lista;
}

    public static void main(String[] args) {
        ejercicio1_6 ejem = new ejercicio1_6();
        ListaDeEnterosEnlazada lista = new ListaDeEnterosEnlazada();
        lista = ejem.calcularSucesion(6);
        for (int i=1; i<=lista.tamanio(); i++){
            System.out.println(lista.elemento(i));
        }
    }
}
