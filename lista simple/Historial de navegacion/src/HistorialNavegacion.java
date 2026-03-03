class HistorialNavegacion {

    private Nodo cabeza;

    public HistorialNavegacion() {
        this.cabeza = null;
    }

    public void visitarPagina(String url, String fechaVisita) {
        Nodo nuevo = new Nodo(url, fechaVisita);

        if (cabeza == null) {
            cabeza = nuevo;
        } else {
            Nodo actual = cabeza;
            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }
            actual.siguiente = nuevo;
        }
    }

    public boolean buscarPagina(String url) {
        Nodo actual = cabeza;

        while (actual != null) {
            if (actual.url.equals(url)) {
                System.out.println("Página encontrada: " + actual.url +
                        " | Fecha: " + actual.fechaVisita);
                return true;
            }
            actual = actual.siguiente;
        }

        System.out.println("Página no encontrada.");
        return false;
    }

    public void mostrarHistorial() {
        Nodo actual = cabeza;

        if (actual == null) {
            System.out.println("Historial vacío.");
            return;
        }

        while (actual != null) {
            System.out.println("URL: " + actual.url +
                    " | Fecha: " + actual.fechaVisita);
            actual = actual.siguiente;
        }
    }


    public void borrarHistorial() {
        cabeza = null;
        System.out.println("Historial eliminado correctamente.");
    }
}
