/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca;

/**
 *
 * @author lechu
 */
import java.util.ArrayList;
import Materiales.MaterialBibliografico;

public class biblioteca {
    private ArrayList<MaterialBibliografico> materiales = new ArrayList<>();

    public void agregarMaterial(MaterialBibliografico material) {
        materiales.add(material);
    }

    public MaterialBibliografico buscarMaterial(String codigoISBN) {
        for (MaterialBibliografico m : materiales) {
            if (m.getCodigoISBN().equalsIgnoreCase(codigoISBN)) {
                return m;
            }
        }
        return null;
    }

    public void imprimirCitas() {
        for (MaterialBibliografico m : materiales) {
            System.out.println(m.generarCitacion());
        }
    }
}
