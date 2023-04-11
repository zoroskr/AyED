/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp03.ejercicio1;

import tp02.ejercicio1.ListaDeEnterosConArreglos;



public class ContadorArbol {
    private ArbolBinario<Integer> arbol;
    private ListaDeEnterosConArreglos lista;
    
    public ContadorArbol(ArbolBinario<Integer> arbol) {
        this.arbol = arbol;
    }

    
    public ListaDeEnterosConArreglos numerosPares(ArbolBinario<Integer> a){
        if (arbol.tieneHijoIzquierdo()){
            numerosPares(arbol.getHijoIzquierdo());
        }
        if (arbol.getDato() % 2 == 0){
            lista.agregarInicio(arbol.getDato());
        }
        if (arbol.tieneHijoDerecho()){
            numerosPares(arbol.getHijoDerecho());;
        }
        return lista;
    }
    
}
