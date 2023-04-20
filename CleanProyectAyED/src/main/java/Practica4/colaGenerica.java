/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practica4;

import tp02.ejercicio2.ListaEnlazadaGenerica;

public class colaGenerica<T> {
    ListaEnlazadaGenerica<T> lista = new ListaEnlazadaGenerica<T>();
    
    public void encolar (T elem){
        lista.agregarFinal(elem);
    }
    public T desencolar () {
        T elem = (T) lista.elemento(1);
        lista.eliminarEn(1);
        return elem;
    }
    public T tope () {
        return (T) lista.elemento(lista.tamanio());
    }
    
    public boolean esVacia () {
        return lista.esVacia();
    }
}
