/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Parciales;

import tp02.ejercicio2.ListaEnlazadaGenerica;
import tp03.ejercicio1.ArbolBinario;

/**
 *
 * @author elmun
 */
public class ProcesadorDeArbol {
    ArbolBinario <Integer> a;

    public ProcesadorDeArbol(ArbolBinario<Integer> a) {
        this.a = a;
    }
    
    
    
    public ListaEnlazadaGenerica<ArbolBinario<Integer>> procesar(){
        ListaEnlazadaGenerica<ArbolBinario<Integer>> lista = new ListaEnlazadaGenerica<ArbolBinario<Integer>>();
        int cantpares = 0;
        System.out.println(procesar(a, lista, cantpares));
        return lista;
    }
    
    private int procesar(ArbolBinario <Integer> a, ListaEnlazadaGenerica<ArbolBinario<Integer>> lista, int cantpares){
        if (!a.esVacio()){
            if (a.getDato() % 2 == 0){
                cantpares++;
                if ((a.tieneHijoIzquierdo()) & (a.tieneHijoDerecho())){
                    lista.agregarFinal(a);
                }
            }

        }
        if (a.tieneHijoIzquierdo()){
            procesar(a.getHijoIzquierdo(), lista, cantpares);
        }
        if (a.tieneHijoDerecho()){
            procesar(a.getHijoDerecho(), lista, cantpares);
        }
        return cantpares;
        
        }
    }
        
