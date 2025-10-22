/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Materiales;

/**
 *
 * @author lechu
 */
public class Tesis extends MaterialBibliografico {
    private String nivelAcademico;

    public Tesis(String titulo, String autorNombre, String autorApellido,
                 int anioPublicacion, String codigoISBN, String nivelAcademico) {
        super(titulo, autorNombre, autorApellido, anioPublicacion, codigoISBN);
        this.nivelAcademico = nivelAcademico;
    }

    @Override
    public double calcularCostoPrestamo() {
        switch (nivelAcademico.toLowerCase()) {
            case "pregrado":
                return 300;
            case "maestría":
            case "maestria":
                return 500;
            case "doctorado":
                return 800;
            default:
                return 0;
        }
    }

    @Override
    public String generarCitacion() {
        return getAutorApellido() + ", " + getAutorNombre().charAt(0) + ". (" + getAnioPublicacion() + "). " +
               getTitulo() + " (Tesis de " + nivelAcademico + "). $" +
               calcularCostoPrestamo() + ". Estado: " + estadoDisponible();
    }
}
