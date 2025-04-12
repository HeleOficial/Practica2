/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica2;

/**
 *
 * @author EIMY TATIANA CORAL M
 */
public class Practica2 {

  
  
  public class Main {
    public static void simularBatalla(Criatura c1, Criatura c2) {
        System.out.println("\n¡Comienza la batalla entre " + c1.getNombre() + " y " + c2.getNombre() + "!");

        while (c1.estaViva() && c2.estaViva()) {
            c1.atacar(c2);
            if (c2.estaViva()) {
                c2.atacar(c1);
            }
        }

        System.out.println("\n¡Batalla terminada!");
        System.out.println("Ganador: " + (c1.estaViva() ? c1.getNombre() : c2.getNombre()));
    }

    public static void main(String[] args) {
        
        Arma espada = new Arma("Espada de Fuego", 5);
        Arma baston = new Arma("Bastón Mágico", 3);

     
        Dragon dragon = new Dragon("Dragón Rojo", 100, 15, "escamas rojas");
        Mago mago = new Mago("Merlín", 80, 10, "hechizo de fuego");
        Guerrero guerrero = new Guerrero("Conan", 90, 12, espada);

      
        simularBatalla(dragon, mago);
        System.out.println("\n=================\n");
        simularBatalla(mago, guerrero);
    }
  }
}
