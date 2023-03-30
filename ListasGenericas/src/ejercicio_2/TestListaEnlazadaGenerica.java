/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_2;

import tp02.ejercicio2.ListaEnlazadaGenerica;

/**
 *
 * @author elmun
 */
public class TestListaEnlazadaGenerica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ListaEnlazadaGenerica lista = new ListaEnlazadaGenerica();
        Estudiante e = new Estudiante("Papu", 17, 1235);
        for (int i=0; i<4; i++){
            lista.agregarFinal(e);
        }
        for (int i=1; i<=4; i++){
            Estudiante estudiante = (Estudiante) lista.elemento(i);
            System.out.println(estudiante.tusDatos());
        }
    }
}
