/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Materiales;

/**
 *
 * @author lechu
 */

public abstract class MaterialBibliografico implements Prestable {
    private String titulo;
    private String autorNombre;
    private String autorApellido;
    private int anioPublicacion;
    private String codigoISBN;
    private boolean disponible;

    public MaterialBibliografico(String titulo, String autorNombre, String autorApellido,
                                 int anioPublicacion, String codigoISBN) {
        this.titulo = titulo;
        this.autorNombre = autorNombre;
        this.autorApellido = autorApellido;
        this.anioPublicacion = anioPublicacion;
        this.codigoISBN = codigoISBN;
        this.disponible = true;
    }
    public String getTitulo() { return titulo; }
    public String getAutorNombre() { return autorNombre; }
    public String getAutorApellido() { return autorApellido; }
    public int getAnioPublicacion() { return anioPublicacion; }
    public String getCodigoISBN() { return codigoISBN; }
    @Override
    public boolean estaDisponible() {
        return disponible;
    }
    @Override
    public void prestar() {
        disponible = false;
    }

    @Override
    public void devolver() {
        disponible = true;
    }

    public String estadoDisponible() {
        return disponible ? "Disponible" : "No disponible";
    }

    public abstract double calcularCostoPrestamo();
    public abstract String generarCitacion();
}
