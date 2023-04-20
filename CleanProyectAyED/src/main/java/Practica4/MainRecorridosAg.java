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
public class MainRecorridosAg {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
ArbolGeneral<Integer> a1 = new ArbolGeneral<Integer>(1);
ArbolGeneral<Integer> a2 = new ArbolGeneral<Integer>(2);
ArbolGeneral<Integer> a3 = new ArbolGeneral<Integer>(3);
ArbolGeneral<Integer> a4 = new ArbolGeneral<Integer>(4);
ArbolGeneral<Integer> a5 = new ArbolGeneral<Integer>(5);
ArbolGeneral<Integer> a6 = new ArbolGeneral<Integer>(6);
ArbolGeneral<Integer> a7 = new ArbolGeneral<Integer>(7);

a1.agregarHijo(a4);
a1.agregarHijo(a5);
a2.agregarHijo(a6);
a2.agregarHijo(a7);

ListaGenerica<ArbolGeneral<Integer>> hijos = new ListaEnlazadaGenerica<ArbolGeneral<Integer>>();
hijos.agregarFinal(a1);
hijos.agregarFinal(a2);
hijos.agregarFinal(a3);
ArbolGeneral<Integer> a = new ArbolGeneral<Integer>(0, hijos);

RecorridosAg recorridos = new RecorridosAg();
ListaGenerica<Integer> lista = recorridos.numerosImparesMayoresQuePostOrden(a, 1);
System.out.println(lista.toString());

ListaGenerica<Integer> lista2 = recorridos.numerosImparesMayoresQuePreOrden(a, 1);
System.out.println(lista2.toString());

ListaGenerica<Integer> lista3 = recorridos.numerosImparesMayoresQueInOrden(a, 1);
System.out.println(lista3.toString());

ListaGenerica<Integer> lista4 = recorridos.numerosImparesMayoresQuePorNiveles(a, 1);
System.out.println(lista4.toString());

System.out.println(a.altura());
System.out.println(a.nivel(1));
System.out.println(a.ancho());
System.out.println(a.esAncestro(0, 1));

    }
    
}
