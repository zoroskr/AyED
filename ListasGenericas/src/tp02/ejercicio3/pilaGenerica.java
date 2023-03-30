/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp02.ejercicio3;

import tp02.ejercicio2.ListaEnlazadaGenerica;

public class pilaGenerica <T> {
    ListaEnlazadaGenerica lista = new ListaEnlazadaGenerica();
    
    public void apilar (T elem){
        lista.agregarFinal(elem);
    }
    public T desapilar (){
        T elem = (T) lista.elemento(lista.tamanio());
        lista.eliminar(lista.tamanio());
        return elem;
    }
    public T tope (){
        T elem = (T) lista.elemento(lista.tamanio());
        return elem;
    }
    public boolean esVacia (){
        return lista.esVacia();
    }
}
