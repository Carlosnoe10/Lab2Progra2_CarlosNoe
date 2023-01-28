
package lab2progra2_carlosnoé;


public class Usuario {
    private String Nombre;
    private int edad;
    private String UserName;
    private String Contrasenya;

    public Usuario(){
        
    }
    public Usuario(String Nombre, int edad, String UserName, String Contrasenya){
        this.Contrasenya= Contrasenya;
        this.UserName= UserName;
        this.edad= edad;
        this.Nombre= Nombre;

    }    
    
    
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    public String getContrasenya() {
        return Contrasenya;
    }

    public void setContrasenya(String Contrasenya) {
        this.Contrasenya = Contrasenya;
    }

    @Override
    public String toString() {
        return "Usuario{" + "Nombre=" + Nombre + ", edad=" + edad + ", UserName=" + UserName + ", Contrasenya=" + Contrasenya + '}';
    }
    
    
    
    
}
