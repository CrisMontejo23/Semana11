
/**
 * Autores:
 * Forero Espinosa Eduar Ivan
 * Giraldo Collazos Juan Pablo
 * Montejo Martinez Cristhian Fernando
 */
package Controlador;

import Modelo.*;
import Vista.*;

public class Controlador {
    
    private Modelo modelo;
    private Registro vista;

    public Controlador(Modelo modelo, Registro vista) {
        this.modelo = modelo;
        this.vista = vista;
    }
    
    public void iniciarVista(){
        vista.setVisible(true);
    }
}
