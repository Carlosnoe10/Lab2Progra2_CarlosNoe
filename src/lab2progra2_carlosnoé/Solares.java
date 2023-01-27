/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2progra2_carlosnoé;


public class Solares {
public double ancho;
public double largo;
private String Estado;

public Solares(){
    
}
public Solares(double ancho, double largo, String Estado){
    this.ancho= ancho;
    this.largo= largo;
    this.Estado= Estado;
}
    public double getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public double getLargo() {
        return largo;
    }

    public void setLargol(int largol) {
        this.largo = largol;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

}

