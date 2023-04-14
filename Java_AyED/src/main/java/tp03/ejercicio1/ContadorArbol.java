package tp03.ejercicio1;

import tp02.ejercicio1.ListaDeEnterosConArreglos;



public class ContadorArbol {
    private ArbolBinario<Integer> arbol;
    private ListaDeEnterosConArreglos lista;
    
    public ContadorArbol(ArbolBinario<Integer> arbol) {
        this.arbol = arbol;
    }

    public ListaDeEnterosConArreglos numerosParesInOrden(ArbolBinario<Integer> a){
         ListaDeEnterosConArreglos lista   = new ListaDeEnterosConArreglos();
         numerosParesInOrdenRecursivo(a, lista);
         return lista;
    }
    
    public ListaDeEnterosConArreglos numerosParesPostOrden(ArbolBinario<Integer> a){
         ListaDeEnterosConArreglos lista   = new ListaDeEnterosConArreglos();
         numerosParesPostOrdenRecursivo(a, lista);
         return lista;
    }
    
    private void numerosParesInOrdenRecursivo(ArbolBinario<Integer> a, ListaDeEnterosConArreglos lista){
        if (a.tieneHijoIzquierdo()) {
             numerosParesInOrdenRecursivo (a.getHijoIzquierdo(), lista);
        }
        if (a.getDato() % 2 == 0){
            lista.agregarInicio(a.getDato());
        }
        if (a.tieneHijoDerecho()) {
            numerosParesInOrdenRecursivo (a.getHijoDerecho(), lista);
        }
    }
    private void numerosParesPostOrdenRecursivo(ArbolBinario<Integer> a, ListaDeEnterosConArreglos lista){
        if (a.tieneHijoIzquierdo()) {
             numerosParesPostOrdenRecursivo (a.getHijoIzquierdo(), lista);
        }
        if (a.tieneHijoDerecho()) {
             numerosParesPostOrdenRecursivo (a.getHijoDerecho(), lista);
        }
        if (a.getDato() % 2 == 0){
            lista.agregarInicio(a.getDato());
        }
    }
}
