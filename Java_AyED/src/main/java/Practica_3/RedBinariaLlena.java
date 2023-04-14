/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practica_3;

import tp02.ejercicio2.ListaEnlazadaGenerica;
import tp02.ejercicio2.ListaGenerica;
import tp03.ejercicio1.ArbolBinario;

public class RedBinariaLlena {
    
public ListaGenerica<Integer> caminoMaxSuma(ArbolBinario<Integer> a) {
    ListaGenerica<Integer> caminoActual = new ListaEnlazadaGenerica<Integer>();
    ListaGenerica<Integer> caminoMax = new ListaEnlazadaGenerica<Integer>();
    int sumaActual = 0;
    int maxSuma = Integer.MIN_VALUE;
    caminoMaxSumaRecursivo(a, caminoActual, caminoMax, sumaActual, maxSuma);
    return caminoMax;
}

private void caminoMaxSumaRecursivo(ArbolBinario<Integer> a, ListaGenerica<Integer> caminoActual, 
    ListaGenerica<Integer> caminoMax, int sumaActual, int maxSuma) {
    
    sumaActual += a.getDato();
    caminoActual.agregarFinal(a.getDato());
    
    if (a.esHoja() && sumaActual > maxSuma){
        maxSuma = sumaActual;
        caminoMax = caminoActual.clonar(); // te guardas el camino con más retraso
    }
    
    if (a.tieneHijoIzquierdo()) {
        caminoMaxSumaRecursivo(a.getHijoIzquierdo(), caminoActual, caminoMax, sumaActual, maxSuma);
    }
    if (a.tieneHijoDerecho()) {
        caminoMaxSumaRecursivo(a.getHijoDerecho(), caminoActual, caminoMax, sumaActual, maxSuma);
    }
    
    caminoActual.eliminarEn(caminoActual.tamanio());
    sumaActual -= a.getDato();
    }
}
