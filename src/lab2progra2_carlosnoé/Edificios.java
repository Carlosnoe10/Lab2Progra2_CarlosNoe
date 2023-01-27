package lab2progra2_carlosnoé;

public class Edificios {

    public int Numeroedificio;
    public int CantidadLocales;
    public String DirrecionRef;
    private String Estado;

    public Edificios(){
        
    }
    
    public Edificios(int Numeroedificio, int CantidadLocales, String DirrecionRef, String Estado) {
        this.CantidadLocales = CantidadLocales;
        this.DirrecionRef = DirrecionRef;
        this.Estado = Estado;
        this.Numeroedificio = Numeroedificio;
    }

    public int getNumeroedificio() {
        return Numeroedificio;
    }

    public void setNumeroedificio(int Numeroedificio) {
        this.Numeroedificio = Numeroedificio;
    }

    public int getCantidadLocales() {
        return CantidadLocales;
    }

    public void setCantidadLocales(int CantidadLocales) {
        this.CantidadLocales = CantidadLocales;
    }

    public String getDirrecionRef() {
        return DirrecionRef;
    }

    public void setDirrecionRef(String DirrecionRef) {
        this.DirrecionRef = DirrecionRef;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

}
