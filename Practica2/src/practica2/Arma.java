package practica2;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Juanm
 */
public class Arma {
    private String nombre;
    private int dañoAdicional;

    public Arma(String nombre, int dañoAdicional) {
        this.nombre = nombre;
        this.dañoAdicional = dañoAdicional;
    }

    public int atacarConArma() {
        return getDañoAdicional();
    }

    public int getDañoAdicional() {
        return dañoAdicional;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
}