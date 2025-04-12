/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica2;

/**
 *
 * @author Juanm
 */
public class Dragon extends Criatura implements Volador {
    private String escamas;

    public Dragon(String nombre, int salud, int fuerza, String escamas) {
        super(nombre, salud, fuerza);
        this.escamas = escamas;
    }

    @Override
    public void atacar(Criatura objetivo) {
        int daño = fuerza;
        if (arma != null) {
            daño += arma.atacarConArma(objetivo);
        }
        System.out.println(nombre + " ataca a " + objetivo.getNombre() + " con " + daño + " de daño");
        objetivo.defender(daño);
    }

    @Override
    public void defender(int daño) {
        salud -= daño;
        System.out.println(nombre + " recibe " + daño + " de daño. Salud restante: " + salud);
    }

    @Override
    public void volar() {
        System.out.println(nombre + " está volando");
    }

    @Override
    public void aterrizar() {
        System.out.println(nombre + " ha aterrizado");
    }
}