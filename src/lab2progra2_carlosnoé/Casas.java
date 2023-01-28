    
package lab2progra2_carlosnoé;

import java.awt.Color;



public class Casas {
public int NumeroC;    
public int NumeroBloq;
public double ancho;
public double largo;
public Color color;
public int NumeroBan;
public int NumeroCuart;
private String Estado;

    public Casas(int NumeroC, int NumeroBloq, double ancho, double largo, int NumeroBan, int NumeroCuart, Color color, String Estado){
        this.NumeroC= NumeroC;
        this.NumeroBloq= NumeroBloq;
        this.ancho= ancho;
        this.NumeroBan= NumeroBan;
        this.NumeroCuart= NumeroCuart;
        this.largo= largo;
        this.color= color;
        this.Estado= Estado;
        
    }
    public Casas(){
        
    }
    public int getNumeroC() {
        return NumeroC;
    }

    public void setNumeroC(int NumeroC) {
        this.NumeroC = NumeroC;
    }

    public int getNumeroBloq() {
        return NumeroBloq;
    }

    public void setNumeroBloq(int NumeroBloq) {
        this.NumeroBloq = NumeroBloq;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getNumeroBan() {
        return NumeroBan;
    }

    public void setNumeroBan(int NumeroBan) {
        this.NumeroBan = NumeroBan;
    }

    public int getNumeroCuart() {
        return NumeroCuart;
    }

    public void setNumeroCuart(int NumeroCuart) {
        this.NumeroCuart = NumeroCuart;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    @Override
    public String toString() {
        return "Casas{" + "NumeroC=" + NumeroC + ", NumeroBloq=" + NumeroBloq + ", ancho=" + ancho + ", largo=" + largo + ", color=" + color + ", NumeroBan=" + NumeroBan + ", NumeroCuart=" + NumeroCuart + ", Estado=" + Estado + '}';
    }


}
