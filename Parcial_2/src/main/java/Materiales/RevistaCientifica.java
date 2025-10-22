/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Materiales;

/**
 *
 * @author lechu
 */
public class RevistaCientifica extends MaterialBibliografico {
    private double factorImpacto;

    public RevistaCientifica(String titulo, String autorNombre, String autorApellido,
                             int anioPublicacion, String codigoISBN, double factorImpacto) {
        super(titulo, autorNombre, autorApellido, anioPublicacion, codigoISBN);
        this.factorImpacto = factorImpacto;
    }

    @Override
    public double calcularCostoPrestamo() {
        return 1000 * factorImpacto;
    }

    @Override
    public String generarCitacion() {
        return getAutorApellido() + ", " + getAutorNombre().charAt(0) + ". (" + getAnioPublicacion() + "). " +
               getTitulo() + " (Revista Científica). FI: " + factorImpacto +
               ". $" + calcularCostoPrestamo() + ". Estado: " + estadoDisponible();
    }
}
