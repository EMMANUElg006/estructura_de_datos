public class Main {
    public static void main(String[] args) {

        HistorialNavegacion historial = new HistorialNavegacion();

        historial.visitarPagina("https://google.com", "03/03/2026 10:00");
        historial.visitarPagina("https://openai.com", "03/03/2026 10:30");
        historial.visitarPagina("https://github.com", "03/03/2026 11:00");

        System.out.println("=== Historial ===");
        historial.mostrarHistorial();

        System.out.println("=== Buscar Página ===");
        historial.buscarPagina("https://openai.com");

        System.out.println("=== Borrar Historial ===");
        historial.borrarHistorial();

        System.out.println("=== Historial Después de Borrar ===");
        historial.mostrarHistorial();
    }
}