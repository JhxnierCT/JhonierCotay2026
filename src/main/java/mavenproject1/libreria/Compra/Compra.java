/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mavenproject1.libreria.Compra;

import mavenproject1.libreria.Cliente.Cliente;
import mavenproject1.libreria.Libro.Libro;

/**
 *
 * @author LAB1-PC2
 */
public class Compra {
    private Cliente cliente;
    private Libro libro1;
    private Libro libro2;

    public Compra(Cliente cliente, Libro libro1, Libro libro2) {
        this.cliente = cliente;
        this.libro1 = libro1;
        this.libro2 = libro2;
    }
    public void mostrar(){
        System.out.println("Clientes"+cliente.getNombre());
        mostrardetalleLibro(libro1);
        mostrardetalleLibro(libro2);
        
    }
    public void mostrardetalleLibro(Libro libro){
        System.out.println("Libro"+libro.getTitulo());
        System.out.println("Categoria"+libro.getCategoria());
        System.out.println("Precio sin IVA"+libro.getPrecio());
        System.out.println("Precio con IVA"+libro.calcularprecioIVA());
    }
}
