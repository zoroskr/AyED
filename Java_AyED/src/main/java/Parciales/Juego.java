/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Parciales;

public class Juego {
    public void encontrarPrincesa(ArbolGeneral<Personaje> arbol) { 
    ListaGenerica<Personaje> lista = new ListaEnlazadaGenerica<Personaje>(); // crea una lista de personaje
    lista.agregarInicio(arbol.getDato()); //agrega a la lista al principio, el dato del arbol
    ListaGenerica<Personaje> camino = new ListaEnlazadaGenerica<Personaje>(); // crea otra lista de personaje
    encontrarPrincesa(arbol, lista, camino); // llama al modulo encontrar princesa
    System.out.print("Se encontró a la Princesa en el camino: " 
    }
    private void encontrarPrincesa(ArbolGeneral<Personaje> arbol, ListaGenerica<Personaje> lista,
     ListaGenerica<Personaje> camino) {
    Personaje p = arbol.getDato(); // guarda el personaje del arbol
    if (p.esPrincesa()) { // si es princesa
     clonar(lista, camino); // copia lo que tiene la lista a la lista camino
    }
    if (camino.esVacia()) { // si la lista camino es vacia
    ListaGenerica<ArbolGeneral<Personaje>> lHijos = arbol.getHijos(); //
    lHijos.comenzar();
    while (!lHijos.fin() && camino.esVacia()) {
    ArbolGeneral<Personaje> aux = lHijos.proximo();
    if (!aux.getDato().esDragon()) {
    lista.agregarFinal(aux.getDato());
    encontrarPrincesa(aux, lista, camino);
    lista.eliminarEn(lista.tamanio());
    }
    }
    }
    }
 }

