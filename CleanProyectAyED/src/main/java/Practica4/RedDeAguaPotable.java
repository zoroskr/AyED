/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practica4;

import tp02.ejercicio2.ListaEnlazadaGenerica;
import tp02.ejercicio2.ListaGenerica;
import tp03.ejercicio1.ArbolBinario;
import tp04.ejercicio1.ArbolGeneral;

/**
 *
 * @author elmun
 */
public class RedDeAguaPotable {
    ArbolGeneral<Double> a;
    
    
    private double minimoCaudal(double caudal, ArbolGeneral<Double> a){
        if (a.esHoja()){
            return caudal;
        }
        double caudal_actual = caudal / a.getHijos().tamanio();
        double caudalMin = caudal_actual;
        ListaGenerica<ArbolGeneral<Double>> hijos = a.getHijos();
        hijos.comenzar();
        while (!hijos.fin()){
           caudalMin = Math.min(minimoCaudal(caudal_actual, hijos.proximo()), caudalMin);
        }
        return caudalMin;
    }
    
}
