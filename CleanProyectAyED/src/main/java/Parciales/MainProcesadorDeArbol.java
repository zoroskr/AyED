/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Parciales;

import tp03.ejercicio1.ArbolBinario;

/**
 *
 * @author elmun
 */
public class MainProcesadorDeArbol {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       ArbolBinario<Integer> ab = new ArbolBinario<Integer> (new Integer(40));
       ArbolBinario<Integer> hijoIzquierdo = new ArbolBinario<Integer>(25);
       hijoIzquierdo.agregarHijoIzquierdo(new ArbolBinario<Integer>(10));
       hijoIzquierdo.agregarHijoDerecho(new ArbolBinario<Integer>(32));
       ArbolBinario<Integer> hijoDerecho = new ArbolBinario<Integer>(78);
       ab.agregarHijoIzquierdo(hijoIzquierdo);
       ab.agregarHijoDerecho(hijoDerecho);
       
       ProcesadorDeArbol p = new ProcesadorDeArbol(ab);
       
       System.out.println(p.procesar().toString());
    }
    
}
