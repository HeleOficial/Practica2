/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica2;

/**
 *
 * @author Juanm
 */
public class Mago extends Criatura implements Magico {
    private String hechizos;

    public Mago(String nombre, int salud, int fuerza, String hechizos) {
        super(nombre, salud, fuerza);
        this.hechizos = hechizos;
    }

    @Override
    public void atacar(Criatura objetivo) {
        int daño = fuerza;
       
        System.out.println(nombre + " lanza un hechizo a " + objetivo.getNombre() + " con " + daño + " de daño");
        objetivo.defender(daño);
    }

    @Override
    public void defender(int daño) {
        salud -= daño;
        System.out.println(nombre + " recibe " + daño + " de daño. Salud restante: " + salud);
    }

    @Override
    public void lanzarHechizo() {
        System.out.println(nombre + " lanza un hechizo de " + hechizos);
    }

    @Override
    public void aprenderHechizo() {
        System.out.println(nombre + " aprende un nuevo hechizo");
    }
}