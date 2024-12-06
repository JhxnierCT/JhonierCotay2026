/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mavenproject1.libreria.Cliente;

/**
 *
 * @author LAB1-PC2
 */
public class Cliente {

    private String nombre;
    private int ID;

    public Cliente(String nombre, int ID) {
        this.nombre = nombre;
        this.ID = ID;
    }

    public String getNombre() {
        return nombre;
    }

    public int getID() {
        return ID;
    }
}
