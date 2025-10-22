/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca;

/**
 *
 * @author lechu
 */
import Materiales.LibroDigital;
import Materiales.RevistaCientifica;
import Materiales.Tesis;
import Materiales.MaterialBibliografico;

public class Main {
    public static void main(String[] args) {
        biblioteca biblioteca = new biblioteca();

        LibroDigital libro = new LibroDigital("Programacion Avanzada", "Juan", "Perez", 2020, "ISBN001", 350);
        RevistaCientifica revista = new RevistaCientifica("Ciencia y Tecnologia", "Laura", "Gomez", 2023, "ISBN002", 0.85);
        Tesis tesis = new Tesis("Inteligencia Artificial Aplicada", "Carlos", "Rojas", 2022, "ISBN003", "Doctorado");

        biblioteca.agregarMaterial(libro);
        biblioteca.agregarMaterial(revista);
        biblioteca.agregarMaterial(tesis);

        MaterialBibliografico encontrado = biblioteca.buscarMaterial("ISBN002");
        if (encontrado != null) {
            System.out.println("\nPrestando: " + encontrado.getTitulo());
            encontrado.prestar();
        }

        System.out.println("\n--- Citas Bibliograficas ---");
        biblioteca.imprimirCitas();
    }
}
