 package src;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    ListaEnlazada ranking = new ListaEnlazada();
    
    // Carga automática de datos de prueba
    ranking.registrarPuntaje("Ana", 2500);
    ranking.registrarPuntaje( "Beto", 1200);
    ranking.registrarPuntaje( "Carla", 3000);
    ranking.registrarPuntaje( "David", 800);
    ranking.registrarPuntaje( "Elena", 2100);
    ranking.registrarPuntaje( "Santi", 1500);
    ranking.registrarPuntaje( "Luis", 1500);
    ranking.registrarPuntaje( "Marta", 500);
    ranking.registrarPuntaje( "Jose", 1800);
    ranking.registrarPuntaje( "Rocio", 950);

    System.out.println("¡Datos de prueba cargados correctamente!");
    
    // Aquí sigue el resto de tu código del menú (Scanner, switch, etc.)

    }


}
    

    