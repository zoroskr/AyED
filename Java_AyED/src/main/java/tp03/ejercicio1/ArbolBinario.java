package tp03.ejercicio1;

import tp02.ejercicio2.ListaEnlazadaGenerica;

public class ArbolBinario<T> {
	private T dato;
	private ArbolBinario<T> hijoIzquierdo;   
	private ArbolBinario<T> hijoDerecho; 
	
	public ArbolBinario() {
		super();
	}

	public ArbolBinario(T dato) {
		this.dato = dato;
	}

	/*
	 * getters y setters
	 * 
	 */
	public T getDato() {
		return dato;
	}

	public void setDato(T dato) {
		this.dato = dato;
	}
	
	/**
	 * Preguntar antes de invocar si tieneHijoIzquierdo()
	 * @return
	 */
	public ArbolBinario<T> getHijoIzquierdo() {
		return this.hijoIzquierdo;
	}

	public ArbolBinario<T> getHijoDerecho() {
		return this.hijoDerecho;

	}

	public void agregarHijoIzquierdo(ArbolBinario<T> hijo) {
		this.hijoIzquierdo = hijo;
	}

	public void agregarHijoDerecho(ArbolBinario<T> hijo) {
		this.hijoDerecho = hijo;
	}

	public void eliminarHijoIzquierdo() {
		this.hijoIzquierdo = null;
	}

	public void eliminarHijoDerecho() {
		this.hijoDerecho = null;
	}

	public boolean esVacio() {
		return this.getDato() == null && !this.tieneHijoIzquierdo() && !this.tieneHijoDerecho();
	}

	public boolean esHoja() {
		return (!this.tieneHijoIzquierdo() && !this.tieneHijoDerecho());

	}

	@Override
	public String toString() {
		return this.getDato().toString();
	}

	 
	public boolean tieneHijoIzquierdo() {
		return this.hijoIzquierdo!=null;
	}

	 
	public boolean tieneHijoDerecho() {
		return this.hijoDerecho!=null;
	}

        public int contarHojas() {
            if (this.esVacio()) { // si el arbol es vacio devuelve 0, porque no tiene hojas
                return 0;
            }
            if (this.esHoja()) { // si es una hoja devuelve 1
                return 1;
            }
            int hojasIzquierdas = 0;
            int hojasDerechas = 0;
            if (this.tieneHijoIzquierdo()) { //si tiene hijo izquierdo
                hojasIzquierdas = this.getHijoIzquierdo().contarHojas();
            }
            if (this.tieneHijoDerecho()) {
                hojasDerechas = this.getHijoDerecho().contarHojas();
            }
            return hojasIzquierdas + hojasDerechas;
        }

	

        public ArbolBinario<T> espejo() {
            ArbolBinario<T> arbolEspejo = new ArbolBinario<T>(this.getDato());
            if (this.tieneHijoIzquierdo()){
                arbolEspejo.agregarHijoDerecho(this.hijoIzquierdo);
            }
            if (this.tieneHijoDerecho()){
                arbolEspejo.agregarHijoIzquierdo(this.hijoDerecho);
            }
            return arbolEspejo;
            }
	


	public void entreNiveles(int n, int m){
            ListaEnlazadaGenerica<ArbolBinario<T>> lista = new ListaEnlazadaGenerica<>(); // genero una lista de arboles genericos
            int nivelActual = 0; // indico el nivel en que me encuentro
            lista.agregarInicio(this); // agrego al principio de la lista / pila
            while (!lista.esVacia() && nivelActual <= m){ // mientras la pial no este vacia y el nivel actual no supere al nivel maximo indicado
                int cantidadNodosEnEsteNivel = lista.tamanio(); // me guardo el tamaño actual de la pila
                if (nivelActual >= n && nivelActual <= m){ // si me encuentro en el rango de niveles indicado
                    for (int i=1; i<lista.tamanio(); i++){ // recorro la pila
                        ArbolBinario<T> nodoActual = lista.elemento(i); //me guardo el arbol de la pila en otro arbol
                        System.out.print(nodoActual.getDato()); //obtengo el dato del nodo y lo imprimo
                    }
                }
                for (int i= 1; i<= cantidadNodosEnEsteNivel; i++){ //hago un for recorriendo los nodos de este nivel
                 ArbolBinario<T> nodoActual = lista.elemento(i); // me guardo cada nodo de la lista
                 if (nodoActual.tieneHijoDerecho()){ // si tiene hijo derecho lo guardo en la lista
                     lista.agregarInicio(nodoActual.getHijoDerecho());
                 }
                 if (nodoActual.tieneHijoIzquierdo()){ // si tiene hijo izquierdo lo guardo en la lista
                    lista.agregarInicio(nodoActual.getHijoIzquierdo());
                 }
                }
                for (int i = 1; i <= cantidadNodosEnEsteNivel; i++) { // hago un for por la cantidad de nodos del nivel
                    lista.eliminarEn(1); // los elimino porque ya los procese
                }
                
                nivelActual++; // aumento el contador de nivel
                
                 
            }
                
            
            
            
            //recorrer hasta el nivel m
            
            
            
	}
      
}
