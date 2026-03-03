class Nodo {
    String url;
    String fechaVisita;
    Nodo siguiente;

    public Nodo(String url, String fechaVisita) {
        this.url = url;
        this.fechaVisita = fechaVisita;
        this.siguiente = null;
    }
}
