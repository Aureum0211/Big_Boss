/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Materiales;

/**
 *
 * @author lechu
 */

public class LibroDigital extends MaterialBibliografico {
    private int numeroPaginas;

    public LibroDigital(String titulo, String autorNombre, String autorApellido,
                        int anioPublicacion, String codigoISBN, int numeroPaginas) {
        super(titulo, autorNombre, autorApellido, anioPublicacion, codigoISBN);
        this.numeroPaginas = numeroPaginas;
    }

    @Override
    public double calcularCostoPrestamo() {
        return (numeroPaginas / 100.0) * 500;
    }

    @Override
    public String generarCitacion() {
        return getAutorApellido() + ", " + getAutorNombre().charAt(0) + ". (" + getAnioPublicacion() + "). " +
               getTitulo() + " (Libro Digital). ISBN " + getCodigoISBN() +
               ". $" + calcularCostoPrestamo() + ". Estado: " + estadoDisponible();
    }
}
