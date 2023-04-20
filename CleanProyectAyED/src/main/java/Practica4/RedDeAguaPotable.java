/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practica4;

import tp02.ejercicio2.ListaGenerica;
import tp04.ejercicio1.ArbolGeneral;

/**
 *
 * @author elmun
 */
public class RedDeAguaPotable {
    ArbolGeneral<Double> a;
    
    public double minimoCaudal(double caudal){
        double min = 99999;
        return minimoCaudal(caudal, min);
    }
    
    private double minimoCaudal(double caudal, double min){
        if (a.esVacio()){
            return 0;
        }
        a.setDato(caudal);
        if (a.esHoja()){
            if ((a.getDato()) < min) {
                min = a.getDato();
            }
        }
         
         ListaGenerica<ArbolGeneral<Double>> lHijos = a.getHijos();
         lHijos.comenzar();
         while (!lHijos.fin()){
             minimoCaudal(caudal / lHijos.tamanio(), min);
         }
         return min;
    }
    
}
