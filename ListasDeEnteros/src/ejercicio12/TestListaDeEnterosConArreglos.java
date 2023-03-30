
package ejercicio12;

import tp02.ejercicio1.ListaDeEnterosConArreglos;

public class TestListaDeEnterosConArreglos {
    public static void main(String[] args) {
        ListaDeEnterosConArreglos lista = new ListaDeEnterosConArreglos();
        for (int i=0;i<5;i++){
            lista.agregarFinal(i);
        }
        for (int i=0; i<=lista.tamanio(); i++){
            System.out.println(lista.elemento(i));
        }
    }
    
}
