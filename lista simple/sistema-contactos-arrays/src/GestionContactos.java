import java.util.ArrayList;

public static class GestionContactos {
    private ArrayList<Contacto> lista;
}

public GestionContactos(){
    ArrayList<Object> lista = new ArrayList<>();
}

public void insertar (Contacto Contacto){
    lista.add (Contacto);
    System.out.println("contacto agregado");
}
public boolean buscar (String nombre ){
    Contacto Lista;
    for (Contacto contacto = Lista){
        if(Contacto.getNombre().equalisIgnoreCase(nombre)){
            return contacto;
        }
        return null;
    }
    public boolean eliminar (string nombre){
        Contacto contacto = buscar(nombre);
        if(contacto != null){
            return  lista.remove(contacto);

        }
        return false;
    }
}
