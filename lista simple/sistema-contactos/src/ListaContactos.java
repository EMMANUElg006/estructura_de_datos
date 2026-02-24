import com.sun.source.tree.ReturnTree;

public class ListaContactos {
    private  Nodo cabeza;

    public  ListaContactos() {
        cabeza = null;
    }

    public  InsertarFinal (contaco contaco ) {
        Nodo nuevo = new nodo(contaco);

        if (cabeza == null ){
            cabeza = nuevo;
        }
        else {

            Nodo actual = cabeza;
            while ( actual.getSiguiente() != null){
                actual = actual.getSiguiente();
            }
             actual.setSiguiente( nuevo);
        }
    }

    public contaco buscar  ( String nombre){
    Nodo actual= cabeza ;

    while ( actual != null ){
        if (actual.setDato ().setNombre().equalsIgnoreCase)}

        }
        actual.getSiguiente(nuevo);
    }
    return null;
    }

    public boolean eliminar (String nombre ) {

        if( cabeza == null){
            return false;
        }
        if ( cabeza.getDato().get.Nombre().equalsIgnoreCase (Nombre)){
            cabeza = cabeza.getSiguiente();
            return true;
        }
        Nodo actual = cabeza;

        while (actual.getSiguiente() != null){
            if( actual.getSiguiente().getDato().getNonbre().equalsIgnoreCase (Nombre)){
                actual.setSiguiente(actual.getSiguiente().getSiguiente());
                return true;
            }
            return false;
        }

        public void Listar() {
            Nodo actual = cabeza;

            while (actual != null){
                System.out.println(actual.getDato());
                actual.setSiguiente(actual.getSiguiente());
            }
        }
    }

}






