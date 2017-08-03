/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primertaller;

import java.util.ArrayList;

/**
 *
 * @author Sebsatian
 */
public class DatosLibros {
    
    ArrayList libros;
    int cantLibros;

    public DatosLibros() {
    }

    public ArrayList getLibros() {
        return libros;
    }

    public void setLibros(ArrayList libros) {
        this.libros = libros;
    }


    public void add(ArrayList libros){
        setLibros(libros);
    }
    
    
    public int cantLibros(ArrayList libros){
        
        return(libros.size());

    }
    
}
