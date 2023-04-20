/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp02.ejercicio2;

import tp04.ejercicio1.ArbolGeneral;
import tp02.ejercicio1.ListaDeEnteros;

public class RecorridosAG<T> {
    
public ListaEnlazadaGenerica<T> numerosImparesMayoresQuePreOrden (ArbolGeneral <Integer> a, Integer n) {
 ListaDeEnteros lis = new ListaDeEnteros();
 this.preOrden(lis, a, n);
 return lis;
 }
 private void preOrden(ListaDeEnteros l, ArbolGeneral<Integer> a, Integer n) {
    if ((a.getDato() % 2 == 0) && (a.getDato() > n)) {
        l.agregarFinal(a.getDato());
    }
    ListaGenerica<ArbolGeneral<Integer>> lHijos = a.getHijos();
 lHijos.comenzar();
 while (!lHijos.fin()) {
 (lHijos.proximo()).preOrden(l);
 }
 }
}

    
    
