import java.util.ArrayDeque;

public class Navegacion {
    private ArrayDeque<String> historial;

    public Navegacion() {
        historial = new ArrayDeque<>();
    }

public void push(String pagina){
    historial.push(pagina);
}


public void pop (){
    if(historial.isEmpty()){
        System.out.println("no hay paginas ingrsadas");
    }else{
        historial.pop();
    }

}


    public void peek() {
        if (historial.isEmpty()) {
            System.out.println("no hay paginas actuales");
        } else {
            System.out.println("su pagina actual es " + historial.peek());
        }
    }

    public void mostrar() {
        if (historial.isEmpty()) {
            System.out.println("No hay historial de páginas.");
            return;
        }

        System.out.println("Historial de páginas:");
        for (String pagina : historial) {
            System.out.println(pagina);
        }
    }
}
