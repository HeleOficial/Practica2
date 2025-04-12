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
    private String tipo;
    private int nivel;

    public Arma(String tipo, int nivel) {
        this.tipo = tipo;
        this.nivel = nivel;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getNivel() {
        return nivel;
    }
    public int atacarConArma(Criatura objetivo) {
    return 10; 
}

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    @Override
    public String toString() {
        return "Arma{" +
                "tipo='" + tipo + '\'' +
                ", nivel=" + nivel +
                '}';
    }
}