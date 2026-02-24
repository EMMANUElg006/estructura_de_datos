public class Nodo {
    private contaco Dato ;

    public contaco getDato() {
        return Dato;
    }

    public void setDato(contaco dato) {
        this.Dato = dato;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    Nodo siguiente;
    
    
    

    public Nodo(contaco dato) {
        this.dato = dato;
    }

    public Object setDato() {
    }
}
}
