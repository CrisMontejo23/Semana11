
/**
 * Autores:
 * Forero Espinosa Eduar Ivan
 * Giraldo Collazos Juan Pablo
 * Montejo Martinez Cristhian Fernando
 */

package Main;

import Modelo.*;
import Controlador.*;
import Vista.Registro;

public class Ejecutar {
    
    public static void main(String[] args) {        
       
        Modelo modelo = new Modelo();
        Registro vista = new Registro();
        Controlador controlador = new Controlador(modelo, vista);
        
        controlador.iniciarVista();
        
    }
        
}
    
