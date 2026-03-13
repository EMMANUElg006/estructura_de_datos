class Nodo {
    constructor(dato) {
        this.dato = dato;
        this.siguiente = null;
    }

    getDato() {
        return this.dato;
    }

    setDato(dato) {
        this.dato = dato;
    }

    getSiguiente() {
        return this.siguiente;
    }

    setSiguiente(siguiente) {
        this.siguiente = siguiente;
    }
}