/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practica4;

import tp02.ejercicio2.ListaEnlazadaGenerica;
import tp02.ejercicio2.ListaGenerica;
import tp04.ejercicio1.ArbolGeneral;

public class AnalizadorArbol {
    
    public int devolverMaximoPromedio (ArbolGeneral<AreaEmpresa> a) {
            colaGenerica<ArbolGeneral<AreaEmpresa>> cola= new colaGenerica<ArbolGeneral<AreaEmpresa>>();
            ArbolGeneral<AreaEmpresa> arbol_aux;
            cola.encolar(a);
            if (a.esVacio()){
                return 0;
            }
            int cantMax = -1;
            while (!cola.esVacia()) {
                arbol_aux = cola.desencolar();
                if (arbol_aux.tieneHijos()) {
                    ListaGenerica<ArbolGeneral<AreaEmpresa>> hijos = arbol_aux.getHijos();
                    hijos.comenzar();
                    int cantNodos = 0;
                    int promedio = 0;
                    while (!hijos.fin()) {
                        cola.encolar(hijos.proximo());
                        promedio = promedio + a.getDato().getTardanza();
                        cantNodos ++;
                    }
                    if ((promedio / cantNodos) > cantMax) {
                        cantMax = promedio;
                    }
                }
            }   
            return cantMax;
           }
    }
