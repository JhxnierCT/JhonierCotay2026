/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package mavenproject1.libreria;

import mavenproject1.libreria.Cliente.Cliente;
import mavenproject1.libreria.Compra.Compra;
import static mavenproject1.libreria.Enumeracion.Categoria.EDUCATIVO;
import mavenproject1.libreria.Libro.Libro;

/**
 *
 * @author LAB1-PC2
 */
public class Libreria {

    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Jhonier",1010);
        
        Libro libro1 = new Libro("PROGRAMACION","JHONIER COTAYA TUAREZ",3.50,EDUCATIVO);
        Libro libro2 = new Libro("MATEMATICAS","RIBALDO NANTIP",58,EDUCATIVO);
        
        Compra compra1=new Compra(cliente1,libro1,libro2);
        compra1.mostrar();
      
    }
}
