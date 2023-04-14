/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practica_3;

import tp03.ejercicio1.ArbolBinario;

/**
 *
 * @author elmun
 */
public class ProfundidadDeArbolBinario {
    ArbolBinario<Integer> arbol;

    public ArbolBinario<Integer> getArbol() {
        return arbol;
    }

    public void setArbol(ArbolBinario<Integer> arbol) {
        this.arbol = arbol;
    }
    
    
    
    public int elementosProfundidad(int p) {
        colaGenerica <ArbolBinario<Integer>> c = new colaGenerica <ArbolBinario<Integer>> ();
        ArbolBinario<Integer> a = new ArbolBinario<Integer>();
        ArbolBinario<Integer> aux = new ArbolBinario<Integer>();
        int nivel = 0;
        int profundidad = 0;
        
        a = getArbol();
        
        aux = null;
        c.encolar(a);
        c.encolar(null);
        while (!c.esVacia()){
            aux = c.desencolar();
            if (aux != null){
                if (aux.tieneHijoIzquierdo()){
                   c.encolar(aux.getHijoIzquierdo());
                }
                if (aux.tieneHijoDerecho()){
                   c.encolar(aux.getHijoDerecho());
                }
            }
            else if (!c.esVacia()){
                c.encolar(null);
                
                if (nivel == p){
                    while (!c.esVacia()){
                        profundidad = profundidad + c.desencolar().getDato();
                    }
                    return profundidad;
                }
                
                nivel++;
                
            }
        }
}
}
