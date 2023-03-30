/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio12;

import tp02.ejercicio1.ListaDeEnterosEnlazada;

public class TestListaDeEnterosEnlazada {
    
    public void imprimirListaInverso (ListaDeEnterosEnlazada lista, int pos){
        if ((pos <= lista.tamanio())){
            imprimirListaInverso(lista, pos + 1);
            System.out.println(lista.elemento(pos));
        }
    }
    
    
    public static void main(String[] args) {
        ListaDeEnterosEnlazada lista = new ListaDeEnterosEnlazada();
        for (int i=0; i<5; i++){
            lista.agregarInicio(i);
        }
        for  (int i=1; i<=lista.tamanio(); i++){
            System.out.println(lista.elemento(i));
       }
        
        TestListaDeEnterosEnlazada test = new TestListaDeEnterosEnlazada();
        test.imprimirListaInverso(lista, 1);
    }
    
}
