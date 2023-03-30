/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp02.ejercicio4;

import tp02.ejercicio2.ListaEnlazadaGenerica;


public class TestBalanceo {
    private ListaEnlazadaGenerica<Character> pila; // creamos una lista enlazada

    public TestBalanceo() {
        this.pila = new ListaEnlazadaGenerica<Character>();
    }

    public boolean estaBalanceado(String s) { 
        for (int i = 0; i < s.length(); i++) { //recorremmos la cadena
            char c = s.charAt(i); //tomamos el elemento i de la cadena y lo guardamos
            if (esCaracterDeApertura(c)) { // si es un caracter de apertura (, [, {
                pila.agregarInicio(c); // agregamos al inicio de la lista
            } else if (esCaracterDeCierre(c)) { // si es un caracter de cierre ), ]. }
                if (pila.esVacia() || !esParBalanceado(pila.elemento(1), c)) { //evaluamos si la pila esta vacia y si los parentesis no estan balanceados
                    return false; // en ese caso el string no esta balanceado
                } else {
                    pila.eliminarEn(1); // elimina el elemento en el tope de la pila
                }
            }
        }
        return pila.esVacia();
    }

    private boolean esCaracterDeApertura(char c) {
        return c == '(' || c == '[' || c == '{';
    }

    private boolean esCaracterDeCierre(char c) {
        return c == ')' || c == ']' || c == '}';
    }

    private boolean esParBalanceado(char apertura, char cierre) {
        return (apertura == '(' && cierre == ')')
                || (apertura == '[' && cierre == ']')
                || (apertura == '{' && cierre == '}');
    }
}

