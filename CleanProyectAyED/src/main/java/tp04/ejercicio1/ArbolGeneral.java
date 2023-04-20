package tp04.ejercicio1;

import Practica4.colaGenerica;
import tp02.ejercicio2.ListaEnlazadaGenerica;
import tp02.ejercicio2.ListaGenerica;

public class ArbolGeneral<T> {

	private T dato;

	private ListaGenerica<ArbolGeneral<T>> hijos = new ListaEnlazadaGenerica<ArbolGeneral<T>>();

	public T getDato() {
		return dato;
	}

	public void setDato(T dato) {
		this.dato = dato;
	}

	public void setHijos(ListaGenerica<ArbolGeneral<T>> hijos) {
		if (hijos==null)
			this.hijos = new ListaEnlazadaGenerica<ArbolGeneral<T>>();
		else
			this.hijos = hijos;
	}

	public ArbolGeneral(T dato) {
		this.dato = dato;
	}

	public ArbolGeneral(T dato, ListaGenerica<ArbolGeneral<T>> hijos) {
		this(dato);
		if (hijos==null)
			this.hijos = new ListaEnlazadaGenerica<ArbolGeneral<T>>();
		else
			this.hijos = hijos;
	}

	public ListaGenerica<ArbolGeneral<T>> getHijos() {
		return this.hijos;
	}

	public void agregarHijo(ArbolGeneral<T> unHijo) {

		this.getHijos().agregarFinal(unHijo);
	}

	public boolean esHoja() {

		return !this.tieneHijos();
	}
	
	public boolean tieneHijos() {
		return !this.hijos.esVacia();
	}
	
	public boolean esVacio() {

		return this.dato == null && !this.tieneHijos();
	}

	

	public void eliminarHijo(ArbolGeneral<T> hijo) {
		if (this.tieneHijos()) {
			ListaGenerica<ArbolGeneral<T>> hijos = this.getHijos();
			if (hijos.incluye(hijo)) 
				hijos.eliminar(hijo);
		}
	}
	
	public ListaEnlazadaGenerica<T> preOrden() {
		return null;
	}
	
        public Integer altura() {
            if (this.esHoja()) {
                return 1;
            }
            int alturaMaxima = 0;
            ListaGenerica<ArbolGeneral<T>> hijos = this.getHijos();
            hijos.comenzar();
            while (!hijos.fin()) {
                ArbolGeneral<T> hijo = hijos.proximo();
                int alturaHijo = hijo.altura();
                if (alturaHijo > alturaMaxima) {
                    alturaMaxima = alturaHijo;
                }
            }
            return alturaMaxima + 1;
        }


	public Integer nivel(T dato) {
            colaGenerica <ArbolGeneral<T>> cola = new colaGenerica <ArbolGeneral<T>>();
            ArbolGeneral<T> arbol_aux;
            cola.encolar(this);
            int nivelAct = 0;
            while (!cola.esVacia()){
                arbol_aux = cola.desencolar();
                if (arbol_aux.getDato().equals(dato)){
                    return nivelAct;
                }
                if (arbol_aux.tieneHijos()){
                    ListaGenerica<ArbolGeneral<T>> hijos = arbol_aux.getHijos();
                    hijos.comenzar();
                    while (!hijos.fin()){
                        cola.encolar(hijos.proximo());
                    }
                }
                nivelAct++;
            }

            return -1;
	}

	public Integer ancho() {
            colaGenerica<ArbolGeneral<T>> cola= new colaGenerica<ArbolGeneral<T>>();
            ArbolGeneral<T> arbol_aux;
            cola.encolar(this);
            if (this.esVacio()){
                return 0;
            }
            int cantMax = -1;
            while (!cola.esVacia()) {
                arbol_aux = cola.desencolar();
                if (arbol_aux.tieneHijos()) {
                    ListaGenerica<ArbolGeneral<T>> hijos = arbol_aux.getHijos();
                    hijos.comenzar();
                    int cantNodos = 0;
                    while (!hijos.fin()) {
                        cola.encolar(hijos.proximo());
                        cantNodos++;
                    }
                    if (cantNodos > cantMax) {
                        cantMax = cantNodos;
                    }
                }
            }   
            return cantMax;
           }
        public Boolean esAncestro(T a, T b){
            ArbolGeneral<T> arbol_aux = this.buscar(a);
            if (arbol_aux.buscar(b) != null){
                return true;
            }
            else {
                return false;
            }
        }
        
        private ArbolGeneral<T> buscar(T dato){
            if ((this.getDato()).equals(dato)){
                return this;
            }
            else {
            ListaGenerica<ArbolGeneral<T>> lHijos = this.getHijos();
            lHijos.comenzar();
            while (!lHijos.fin()){
                lHijos.proximo().buscar(dato);
            }
            }
            return null;
        }
}