/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mavenproject1.libreria.Libro;

import mavenproject1.libreria.Enumeracion.Categoria;

/**
 *
 * @author LAB1-PC2
 */
public class Libro {
    private String titulo;
    private String autor;
    private double precio;
    private Categoria categoria;

    public Libro(String titulo, String autor, double precio, Categoria categoria) {
        this.titulo = titulo;
        this.autor = autor;
        this.precio = precio;
        this.categoria = categoria;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public double getPrecio() {
        return precio;
    }

    public Categoria getCategoria() {
        return categoria;
    }
    
    public double calcularprecioIVA (){
        return precio*0.12;
    }
}
