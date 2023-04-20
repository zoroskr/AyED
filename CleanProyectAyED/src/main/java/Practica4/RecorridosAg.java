/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practica4;

import tp02.ejercicio2.ListaEnlazadaGenerica;
import tp02.ejercicio2.ListaGenerica;
import tp04.ejercicio1.ArbolGeneral;

/**
 *
 * @author elmun
 */
public class RecorridosAg {
    public ListaGenerica<Integer> numerosImparesMayoresQuePreOrden (ArbolGeneral<Integer> a, int n){
        ListaEnlazadaGenerica<Integer> lista = new ListaEnlazadaGenerica<Integer> ();
        preOrden(a, n, lista);
        return lista;
    }
    
    private void preOrden (ArbolGeneral <Integer> a, int n, ListaEnlazadaGenerica<Integer> lista){
        // if (((a.getDato()) % 2 != 0) && (a.getDato()) > n) {
       //     lista.agregarFinal(a.getDato());
       // }
         lista.agregarFinal(a.getDato());
         ListaGenerica<ArbolGeneral<Integer>> lHijos = a.getHijos();
         lHijos.comenzar();
         while (!lHijos.fin()){
             preOrden(lHijos.proximo(), n, lista);
         }
    }
    
    public ListaGenerica< Integer > numerosImparesMayoresQuePostOrden (ArbolGeneral<Integer> a, Integer n){
        ListaEnlazadaGenerica<Integer> lista = new ListaEnlazadaGenerica<Integer> ();
        postOrden(a, n, lista);
        return lista;
    }
        
    
    private void postOrden(ArbolGeneral<Integer> a, int n, ListaEnlazadaGenerica<Integer> lista) {
        ListaGenerica<ArbolGeneral<Integer>> lHijos = a.getHijos();
        lHijos.comenzar();
        while (!lHijos.fin()) {
            postOrden(lHijos.proximo(), n, lista);
        }
        lista.agregarFinal(a.getDato());



        //if (((a.getDato()) % 2 != 0) && (a.getDato()) > n) {
        //}
    }
    
    public ListaGenerica< Integer > numerosImparesMayoresQueInOrden (ArbolGeneral<Integer> a, Integer n){
        ListaEnlazadaGenerica<Integer> lista = new ListaEnlazadaGenerica<Integer> ();
        inOrden(a, n, lista);
        return lista;
    }
        
    
    private void inOrden(ArbolGeneral<Integer> a, int n, ListaGenerica<Integer> lista) {
        ListaGenerica<ArbolGeneral<Integer>> lHijos = a.getHijos();
        if (!lHijos.esVacia()) {
            lHijos.comenzar();
            inOrden(lHijos.proximo(), n, lista);
        }
        lista.agregarFinal(a.getDato());
        while (!lHijos.fin()) {
            inOrden(lHijos.proximo(), n, lista);
        }
    }
    
    public ListaGenerica< Integer > numerosImparesMayoresQuePorNiveles (ArbolGeneral<Integer> a, Integer n){
        ListaEnlazadaGenerica<Integer> result = new ListaEnlazadaGenerica<Integer> ();
        colaGenerica <ArbolGeneral<Integer>> cola = new colaGenerica <ArbolGeneral<Integer>>();
        ArbolGeneral<Integer> arbol_aux;
        cola.encolar(a);
        while (!cola.esVacia()){
            arbol_aux = cola.desencolar();
            result.agregarFinal(arbol_aux.getDato());
            if (arbol_aux.tieneHijos()){
                ListaGenerica<ArbolGeneral<Integer>> hijos = arbol_aux.getHijos();
                hijos.comenzar();
                while (!hijos.fin()){
                    cola.encolar(hijos.proximo());
                }
            }
        }
        return result;
    }
}
