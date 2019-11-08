package examen.pkg1_carlosfortin;

import java.util.Date;

/**
 *
 * @author Carlos Fortin
 */
public class Administrador extends Persona{

    public Administrador() {
        super();
    }

    public Administrador(String nombre, String password, Date nacimiento, String telefono, String correo, String favGen) {
        super(nombre, password, nacimiento, telefono, correo, favGen);
    }

    @Override
    public String toString() {
        return "Administrador{" +super.toString()+ '}';
    }
    
}
