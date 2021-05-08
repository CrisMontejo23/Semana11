
/**
 * Autores:
 * Forero Espinosa Eduar Ivan
 * Giraldo Collazos Juan Pablo
 * Montejo Martinez Cristhian Fernando
 */

package Modelo;

public class Modelo {
    
    private String nombre,apellido,correo,di;

    public Modelo() {
    }

    public Modelo(String nombre, String apellido, String correo, String di) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.di = di;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDi() {
        return di;
    }

    public void setDi(String di) {
        this.di = di;
    }
    
    
}
